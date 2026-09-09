class Solution {
    public long countCommas(long n) {
        // long count=0;
        // for(long i=999;i<=n;i++){
        //     if(i>999999){
        //         count+=2;
        //     }else if(i>999){
        //         count++;
        //     }
        // }
        // return count;
        long ans=0;
        for(long start=1000;start<=n;start*=1000){
            ans+=n-start+1;
        }
        return ans;

    }
}