class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res=new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            char curr=(char)(rem+'A');
            res.append(curr);
            columnNumber/=26;
        }
        return res.reverse().toString();
    }
}