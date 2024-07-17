class Solution {
    public int maximumValue(String[] strs) {
        int max=-1;
        for(String str:strs){
            max=Math.max(max,StringChecker(str)); 
        }
        return max;
        
    }

    public int StringChecker(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch <='z'){
                return s.length();
            }
           
        }
         return Integer.parseInt(s);
    }
}