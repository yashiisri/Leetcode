class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=Integer.MIN_VALUE;

         for(int candy:candies){
           if(candy>max)
            max=candy;
         }

         ArrayList<Boolean>list=new ArrayList<>();
           for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                list.add(true);
            }
                    else{
                        list.add(false);
                    }
                
            }
              return list;
        }
      

        
    }
