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
    Integer prev = null;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return minDiff;
    }
    
    public void dfs(TreeNode node) {
        if(node == null) {
            return;
        }
        
        dfs(node.left);
        
        if(prev != null) {
            minDiff = Math.min(minDiff, Math.abs(node.val - prev));
        }
        prev = node.val;
        
        dfs(node.right);
    }
}