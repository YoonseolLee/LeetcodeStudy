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
    TreeNode newRoot = null;
    public TreeNode increasingBST(TreeNode root) {
        DFS(root);
        return newRoot;
    }

    private void DFS(TreeNode root) {
        if (root == null) {
            return;
        }
        DFS(root.right);
        newRoot = new TreeNode(root.val, null, newRoot);
        DFS(root.left);
    }
}