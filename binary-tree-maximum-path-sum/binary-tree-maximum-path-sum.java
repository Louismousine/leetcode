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
    int haha = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        rec(root);
        return haha;
    }
    
    int rec(TreeNode r){
        if(r==null)return 0;
        int l = Math.max(0, rec(r.left));
        int ri = Math.max(0,rec(r.right));
        haha = Math.max(haha,l+r.val+ri);
        return Math.max(l, ri)+r.val;
    }
}