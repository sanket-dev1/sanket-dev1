class Solution {
    public int maxDepth(String s) {
        int opened=0;
        int res=0;
        for(final char c:s.toCharArray()){
            if(c=='('){
                res=Math.max(res,++opened);
            }else if(c==')'){
                --opened;
            }
        }
        return res;
    }
}


// class Solution {
//     public int maxDepth(String s) {
//         Stack<Character> st=new Stack<>();
//         int max=0;
//         for(char ch:s.toCharArray()){
//             if(ch=='('){
//                 st.push(ch);
//                 max=Math.max(max,st.size());
//             }
//             if(ch==')'){
//                 st.pop();
//             }
//         }
//         return max;
//     }
// }
