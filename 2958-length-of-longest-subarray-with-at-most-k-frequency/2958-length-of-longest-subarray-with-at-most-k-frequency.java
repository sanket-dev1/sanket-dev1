class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();

        int start = 0, end = 0;
        int res = 0;

        while (end < nums.length) {
            m.put(nums[end], m.getOrDefault(nums[end], 0) + 1);

            while (m.get(nums[end]) > k) {
                m.put(nums[start], m.get(nums[start]) - 1);
                start++;
            }

            res = Math.max(res, end - start + 1);
            end++;
        }

        return res;
    }
}