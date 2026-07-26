class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[0]*nums[1]*nums[nums.length-1]);
        }
        return -1;
    }
}

// class Solution {
//     public int maximumProduct(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;

//         int prod1 = nums[n-1] * nums[n-2] * nums[n-3];
//         int prod2 = nums[n-1] * nums[0] * nums[1];

//         return Math.max(prod1, prod2);
//     }
// }