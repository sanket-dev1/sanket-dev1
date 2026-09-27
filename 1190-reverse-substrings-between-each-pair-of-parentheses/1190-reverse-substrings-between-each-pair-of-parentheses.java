class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st=new Stack<>();
        StringBuilder curr=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(curr);
                curr=new StringBuilder();
            }
            else if(ch==')'){
                curr.reverse();
                StringBuilder prev=st.pop();
                prev.append(curr);
                curr=prev;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}



// class Solution {
//     public String reverseParentheses(String s) {
//         String curr="";
//         Stack<String> st=new Stack<>();
//         for(int ch=0;ch<s.length();ch++){
//             if(s.charAt(ch)=='('){
//                 st.push(curr);
//                 curr="";
//             }
//             else if(s.charAt(ch)==')'){
//                 String rev=new StringBuilder(curr).reverse().toString();
//                 String str=st.pop();
//                 curr=str+rev;
//             }else{
//                 curr=curr+s.charAt(ch);
//             }
//         }
//         return curr;
//     }
// }