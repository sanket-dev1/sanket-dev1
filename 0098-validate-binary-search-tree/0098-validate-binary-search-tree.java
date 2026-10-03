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
    public boolean isValidBST(TreeNode root) {
        return healpher(root,null,null);
    }
    boolean healpher(TreeNode curr,Integer low,Integer high){
        if(curr==null){
            return true;
        }
        if(low != null && curr.val<=low){
            return false;
        }
        if(high != null && curr.val>=high){
            return false;
        }
        boolean Left=healpher(curr.left,low,curr.val);
        boolean Right=healpher(curr.right,curr.val,high);
        return Left && Right;
    }
}