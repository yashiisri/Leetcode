class Solution {
    public int sumBase(int n, int k) {
        int sum=0;
        if(k==10){
            while(n>0){
                sum=sum+(n%10);
                n=n/10;
            }
            return sum;
        }

        while(n>=k){
            sum=sum+(n%k);
            n=n/k;
        }
        return sum+n;
        
    }
}