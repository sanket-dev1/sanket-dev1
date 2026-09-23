class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int target=total-x;
        // If x is greater than total
        if (target < 0) {
            return -1;
        }

        // If we need to keep the whole array
        if (target == 0) {
            return nums.length;
        }
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefixsum=0;
        int maxlen=-1;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int req=prefixsum-target;
            if(map.containsKey(req)){
                int length=i-map.get(req);
                maxlen=Math.max(maxlen,length);
            }
            if(!map.containsKey(prefixsum)){
                map.put(prefixsum,i);
            }
        }
        if(maxlen==-1){
            return -1;
        }
        return nums.length-maxlen;
    }
}