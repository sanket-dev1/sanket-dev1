class Solution {
    public int smallestIndex(int[] nums) {
        int smallIdx=-1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int sum=0;
            while(val>0){
                int digit=val%10;
                sum+=digit;
                val=val/10;
            }
            if(i==sum){
                return i;
            }
        }
        return -1;
    }
}