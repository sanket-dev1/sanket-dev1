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
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}