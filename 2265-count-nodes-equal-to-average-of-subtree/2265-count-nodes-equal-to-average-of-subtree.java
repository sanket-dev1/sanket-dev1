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

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        count(root);
        return ans;
    }

    int[] count(TreeNode node) {

        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = count(node.left);
        int[] right = count(node.right);

        int total = left[0] + right[0] + node.val;
        int count = left[1] + right[1] + 1;

        int avg = total / count;

        if (node.val == avg) {
            ans++;
        }

        return new int[]{total, count};
    }
}