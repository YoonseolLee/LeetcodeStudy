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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            // 같으면 true, 다르면 false를 반환한다.
            return p == q;
        } 

        /**
        기본 조건 검사를 통과하면, 현재 p와 q의 val값을 비교하고, 동시에 isSameTree(p.left, q.left)와 
        isSameTree(p.right, q.right)를 호출하여 재귀적으로 왼쪽 자식 노드와 오른쪽 자식 노드를 비교한다. 
         */
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}