class Solution {
    public int maxProduct(int[] nums) {
        int first=0;
        int second=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>=first){
                second=first;
                first=nums[i];
            }
            else if(nums[i]>second){
                second=nums[i];
            }
        }
        return (first-1)*(second-1);
    }
}