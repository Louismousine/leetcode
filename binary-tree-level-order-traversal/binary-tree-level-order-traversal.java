/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        rec(root,0);
        return ret;
    }
    
    void rec(TreeNode r, int lvl){
        if(r==null)return;
        if(map.containsKey(lvl)){
            map.get(lvl).add(r.val);
        }
        else{
            List<Integer> l =new ArrayList<>();
            ret.add(l);
            l.add(r.val);
            map.put(lvl,l);
        }
        rec(r.left, lvl+1);
        rec(r.right,lvl+1);
    }
}