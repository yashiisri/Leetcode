class Solution {
    public int countPrimeSetBits(int left, int right) {
        int total=0;
        for(int i=left;i<=right;i++){
            int nbits=0;
            int n=i;
            while(n>0){
                if(n%2==1){
                    nbits+=1;
                }
                n/=2;
            }
            boolean prime=true;
            if(nbits<=1){
                prime=false;
            }
            for(int j=2;j<=Math.sqrt(nbits);j++){
                if(nbits%j==0){
                    prime=false;
                }
            }
            if(prime){
                total+=1;
            }
        }
        return total;
        
    }
}