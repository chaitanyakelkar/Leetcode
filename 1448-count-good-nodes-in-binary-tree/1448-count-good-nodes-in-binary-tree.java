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
    private int dfs(TreeNode root, int max){
        if (root == null) return 0;
        boolean good = false;
        if (max <= root.val){
            good = true;
            max = root.val;
        }
        return ( good ? 1 : 0 ) + dfs(root.left, max) + dfs(root.right, max);
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }
}