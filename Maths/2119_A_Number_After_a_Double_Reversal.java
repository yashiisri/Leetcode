class Solution {
    public boolean isSameAfterReversals(int num) {
      
      int n=num;
      int ans=reverse(num);
      int a=reverse(ans);
      if(a==n){
        return true;
      }
      return false;
    }
    public static int reverse(int num){
        int revnum=0;
        while(num!=0){
            int rem=num%10;
            revnum=revnum*10+rem;
            num=num/10;
        }
        return revnum;
    }
}
