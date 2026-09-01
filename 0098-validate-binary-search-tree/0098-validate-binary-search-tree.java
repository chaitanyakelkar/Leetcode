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
    private boolean dfs(TreeNode root, long leftBoundry, long rightBoundry){
        boolean valid = false;
        if(root == null) return true;
        if (root.val > leftBoundry && root.val < rightBoundry) valid = true;
        return valid && dfs(root.left, leftBoundry, root.val) && dfs(root.right, root.val, rightBoundry);
    }

    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}