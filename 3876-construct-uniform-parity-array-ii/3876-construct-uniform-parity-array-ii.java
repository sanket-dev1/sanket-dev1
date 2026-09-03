class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        boolean isEven=true;
        for(int n:nums1){
            min=Math.min(min,n);
            if(n%2 != 0){
                isEven=false;
            }
        } 
        if(min%2!=0){
            return true;
        }
        if(isEven){
            return true;
        }
        return false;
    }
}