class Solution {
    public int minimumDeletions(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int minIndex = 0;
        int maxIndex = 0;

        // Find minimum, maximum and their indices
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Make minIndex the smaller index
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        // Case 1: Remove both from the left
        int removeLeft = right + 1;

        // Case 2: Remove both from the right
        int removeRight = nums.length - left;

        // Case 3: Remove smaller index from left
        // and larger index from right
        int removeBoth = (left + 1) + (nums.length - right);

        return Math.min(removeLeft, Math.min(removeRight, removeBoth));
    }
}