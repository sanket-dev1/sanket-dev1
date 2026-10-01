// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack=new Stack<>();

//         for(Character ch:s.toCharArray()){
//             if(ch=='(' || ch=='{' || ch=='['){
//             stack.push(ch);
//             }else{
//             if(ch==')'){
//                 if(stack.isEmpty() || stack.pop() != '('){
//                     return false;
//                 }
//             }
//             if(ch=='}'){
//                 if(stack.isEmpty() || stack.pop() != '{'){
//                     return false;
//                 }
//             }
//             if(ch==']'){
//                 if(stack.isEmpty() || stack.pop() != '['){
//                     return false;
//                 }
//             }
//         }
//         }
//         return stack.isEmpty();
//     }
// }

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
           if(ch=='(' || ch=='[' || ch=='{'){
            st.push(ch);
           }else{
            if(st.isEmpty()){
                return false;
            }
            if(ch==')'){
            char c=st.pop();
            if(c!='('){
                return false;
            }
           }
           
           if(ch==']'){
            char c=st.pop();
            if(c!='['){
                return false;
            }
           }
           
           if(ch=='}'){
            char c=st.pop();
            if(c!='{'){
                return false;
            }
           }
           }
           
            
           
        }
        return st.isEmpty();
    }
}