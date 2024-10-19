class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[58];
        int len = 0;
        for(char ch: s.toCharArray()) freq[ch-'A']++;
        for(int data: freq) len += data%2==0?data:data-1;
        return len==s.length()?len:len+1;
    }
}