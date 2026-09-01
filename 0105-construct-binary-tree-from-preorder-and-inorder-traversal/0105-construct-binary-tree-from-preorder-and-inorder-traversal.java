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
    private HashMap<Integer, Integer> map = new HashMap<>();
    private int[] inorder;
    private int[] preorder;
    private int index = 0;

    private TreeNode dfs(int left, int right){
        if (left > right) return null;
        int root = preorder[index++];
        TreeNode temp = new TreeNode(root);
        temp.left = dfs(left, map.get(root)-1);
        temp.right = dfs(map.get(root)+1, right);
        return temp;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        TreeNode result = dfs(0, inorder.length-1);
        return result;
    }
}