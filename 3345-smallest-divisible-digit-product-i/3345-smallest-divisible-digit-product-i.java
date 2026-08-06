class Solution {
    public int del(int val){
        int prod=1;
        while(val>0){
            int digit=val%10;
            prod*=digit;
            val=val/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        while(del(n)%t!=0){
            n++;
        }
        return n;
    }
}