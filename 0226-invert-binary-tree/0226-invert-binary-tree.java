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
    TreeNode temp;
    private void reverseTree(TreeNode root){
        if (root == null) return;

        temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverseTree(root.left);
        reverseTree(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        reverseTree(root);
        return root;
    }
}