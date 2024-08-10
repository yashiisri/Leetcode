class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;  
        for(int i = 0; i < sentences.length; i++){
            String s = sentences[i];  
            String[] arr = s.strip().split(" ");
            if(ans < arr.length){
                ans = arr.length;  
            }
        }
        return ans; 
    }
}
