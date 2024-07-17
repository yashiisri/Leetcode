class Solution {
    public int vowelStrings(String[] words, int left, int right) {
       int count=0;
      
       for(int i=left;i<=right;i++){
         if(isVowel(words[i].charAt(0))&& isVowel(words[i].charAt(words[i].length()-1))){
            count++;
         }
       }
        return count;
    }

    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e'|| ch=='i' ||ch=='o'|| ch=='u'){
            return true;
        }
        return false;
    }
      
}