class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int count=0;
       int n=bits.length;
       int i=0;
       while(i<n-1){
        if(bits[i]==1){
            i=i+2;
        }else{
            i=i+1;
        }
       }
       return i==n-1;
        
    }
}