class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for(char c1 : c){
            if(!Character.isDigit(c1)){
                st.push(c1);
            }
            else {
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}