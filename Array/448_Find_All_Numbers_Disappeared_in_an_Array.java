class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while( i<nums.length){
            int index=nums[i]-1;
            if(nums[i]!=nums[index]){
                swap(nums,i,index);
            }else{
                i++;
            }

        }

        //just find missing number
        List <Integer> ans=new ArrayList<>();
        for(int indexx=0;indexx<nums.length;indexx++){
            if(nums[indexx]!=indexx+1){
            ans.add(indexx+1);
        }
        } 
         return ans;
        }
      
        
    
  static void swap(int[] arr , int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
