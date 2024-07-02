class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++)
            {
                int sum=0;
         for(int bankaccount=0;bankaccount<accounts[person].length;bankaccount++){
               sum+=accounts[person][bankaccount];
         }
         if(sum>max){
            max=sum;
         }
      }
      return max;        
    }
}