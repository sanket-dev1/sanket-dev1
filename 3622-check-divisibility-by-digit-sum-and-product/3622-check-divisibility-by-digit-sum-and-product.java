class Solution {
    public boolean checkDivisibility(int n) {
        if(n==10){
            return true;
        }
        int val=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n=n/10;
        }
        int total=sum+prod;
        return val%total==0;
    }
}