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
    public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> list=new LinkedList<>();
        if(root!=null){
            list.add(root);
        }
        while(!list.isEmpty()){
            TreeNode temp=list.poll();
            if(temp.left!=null){
                list.add(temp.left);
            }
            if(temp.right!=null){
                list.add(temp.right);
            }
            TreeNode curr = temp.left;
            temp.left = temp.right;
            temp.right = curr;
        }
        return root;
    }
}