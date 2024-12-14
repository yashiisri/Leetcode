class Solution {
    public String countAndSay(int m) {
        if (m==1) return "1";
        StringBuilder comp = new StringBuilder();
        int i=0,j=0;
        String word=countAndSay(m-1);
        int n=word.length();
        while(j<n){
            if (word.charAt(i)==word.charAt(j)) {
                if (j-i==9){
                    int count=j-i;
                    comp.append(count);
                    comp.append(word.charAt(i));
                    i=j;
                }
                j++;
            }
            else {
                int count=j-i;
                comp.append(count);
                comp.append(word.charAt(i));
                i=j;
            }
        }

        int count=j-i;
        comp.append(count);
        comp.append(word.charAt(i));

        return comp.toString();
    }
}