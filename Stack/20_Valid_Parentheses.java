class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<Character>();
       for(char c: s.toCharArray()){
        if(c=='(')
            stack.push(')');
        else if(c=='{')
            stack.push('}');
        else if(c=='[')
            stack.push(']');
        else if(stack.isEmpty() || stack.pop() != c)
            return false;
        }
        return stack.isEmpty();
       
       }
}



//approach 2

class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<Character>();
       for(char c: s.toCharArray()){
        if(c=='(' || c=='{' || c=='[')
        stack.push(c);
        else{
            if(c==')'){
                if(stack.isEmpty() || stack.pop()!='(')
                return false;

            }
            if(c=='}'){
                if(stack.isEmpty() || stack.pop()!='{')
                return false;
                
            }
            if(c==']'){
                if(stack.isEmpty() || stack.pop()!='[')
                return false;
                
            }
        }
}

return stack.isEmpty();
    }
}