class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            int ans=-1;
            for(int k=j+1;k<nums2.length;k++){
                if(nums1[i]<nums2[k]){
                    ans=nums2[k];
                    break;
                }
            }
            nums1[i]=ans;
        }
        return nums1;
    }
}