class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int end=nums[nums.length-1];
        int curr=nums[0],index=0;
        List<Integer>ls=new ArrayList<>();
        while(curr<end){
            if(nums[index]==curr){
                index++;
                curr++;
                continue;
            }else{
                while(curr<nums[index]){
                    ls.add(curr++);
                }
                index++;
                curr++;
            }
        }
        return ls;
    }
}