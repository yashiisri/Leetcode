class Solution {
    public String sortSentence(String s) {
                String [] store = new String[whiteSpaces(s) + 2 ] ;
        // this will split the words into array of string with a indivisual mapping
        String [] str = s.split(" ");
        // now we have thew array of strings.

        for (String obj : str) {
         int x = Character.getNumericValue(obj.charAt(obj.length()-1));
            store[x] = obj.substring(0,obj.length()-1);
        }
       StringBuilder ans  =  new StringBuilder() ;
        for (String value : store) {
            if (value != null) {
                ans.append(value).append(" ");
            }
        }

        return ans.toString().trim();
    }
       int whiteSpaces(String str){
        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
             count++;
            }
        }
        return count ;
    }
}