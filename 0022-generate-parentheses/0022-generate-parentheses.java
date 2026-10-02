class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate("",n,res);
        return res;
    }
    void generate(String curr,int n,List<String> res){
        if(curr.length()==n*2){
            if(isValid(curr)){
                res.add(curr);
            }
            return;
        }
        generate(curr+"(",n,res);
        generate(curr+")",n,res);
    }
    boolean isValid(String str){
        int balance=0;
        for(char ch:str.toCharArray()){
            if(ch=='('){
                balance++;
            }else{
                balance--;
            }
            if(balance<0){
                return false;
            }
        }
        return balance==0;
    }
}