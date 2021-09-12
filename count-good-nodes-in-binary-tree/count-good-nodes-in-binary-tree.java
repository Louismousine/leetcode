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
    public int goodNodes(TreeNode root) {
        return rec(root,root.val);
    }
    
    public int rec(TreeNode r, int max){
        if(r==null)return 0;
        if(r.val>=max){
            return 1 + rec(r.left,r.val) + rec(r.right,r.val);
        }
        return rec(r.left,max) + rec(r.right,max);
    }
}