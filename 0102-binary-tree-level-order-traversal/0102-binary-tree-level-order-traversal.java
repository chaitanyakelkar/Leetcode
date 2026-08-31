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
    class Pair{
        public TreeNode root;
        public int level;
        public Pair(TreeNode root, int level){
            this.root = root;
            this.level = level;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        List<List<Integer>> bfs = new ArrayList<>();

        if (root == null) return bfs;

        q.offer(new Pair(root, 0));
        while (q.size() != 0){
            Pair p = q.poll();
            if (bfs.size() != p.level + 1) bfs.add(new ArrayList<>());
            bfs.get(p.level).add(p.root.val);
            if (p.root.left != null)
            q.offer(new Pair(p.root.left, p.level+1));
            if (p.root.right != null)
            q.offer(new Pair(p.root.right, p.level+1));
        }

        return bfs;
    }
}