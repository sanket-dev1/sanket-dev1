class Solution {
    public int distinctSubseqII(String s) {
        int MOD=1000000007;
        int end[]=new int[26];
        int total=0;
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            int oldtotal=total;
            int newsubseq=(oldtotal+1-end[index]+MOD)%MOD;
            total=(total+newsubseq)%MOD;
            end[index]=(end[index]+newsubseq)%MOD;
        }
        return total;
    }
}