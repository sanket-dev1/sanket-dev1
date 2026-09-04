// class Solution {
//     public int firstStableIndex(int[] nums, int k) {
//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         int i;
//         for(i=0;i<nums.length;i++){
//             for(int j=0;j<=i;j++){
//                 max=Math.max(max,nums[j]);
//             }
//             int idx=-1;
//             for(int j=i;j<nums.length;j++){
//                 min=Math.min(min,nums[j]);
//                 idx=j;
//             }
//             if((max-min)<=k){
//                 return idx;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffix = new int[n];
 
        int mn = Integer.MAX_VALUE;
        // Build suffix minimum
        for (int i = n - 1; i >= 0; i--) {
            mn = Math.min(mn, nums[i]);
            suffix[i] = mn;
        }
 
        int mx = 0;
        // Find first index with score <= k
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            int score = mx - suffix[i];
            if (score <= k)
                return i;
        }
 
        return -1;
    }
}