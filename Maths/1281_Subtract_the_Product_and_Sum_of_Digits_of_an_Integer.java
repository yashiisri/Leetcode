class Solution {
    public int subtractProductAndSum(int n) {
        
        long product=1;
        long sum=0;
       while(n>0){
        sum+=n%10;
        product*=n%10;
        n=n/10;

       }
       int difference=(int)(product-sum);
       return difference;
    }
}