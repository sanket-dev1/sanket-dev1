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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        if(root==null){
            return result;
        }
        while(!que.isEmpty()){
            long sum=0;
            int levelSize=que.size();
            for(int i=0;i<levelSize;i++){
                TreeNode currNode=que.poll();
                sum+=currNode.val;
                if(currNode.left!=null){
                    que.offer(currNode.left);
                }
                if(currNode.right!=null){
                    que.offer(currNode.right);
                }
            }

            result.add((double)sum/levelSize);
        }
        return result;
    }
}