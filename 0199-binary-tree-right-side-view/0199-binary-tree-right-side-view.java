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
    private List<List<Integer>> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        List<Integer> result = new ArrayList<>();
        for (List<Integer> tempList : list)
            result.add(tempList.get(tempList.size()-1));
        return result;
    }

    public void dfs(TreeNode root, int level){
        if (root == null) return;
        if (list.size() == level) list.add(new ArrayList<>());
        list.get(level).add(root.val);
        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }
}