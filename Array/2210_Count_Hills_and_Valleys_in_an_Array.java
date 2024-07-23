class Solution {
    public int countHillValley(int[] nums) {
        int ans=0;
    
      for( int i=1;i+1<nums.length;i++){
        if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
            ans++;
        }
        if (nums[i] < nums[i+1] && nums[i] < nums[i-1]){
            ans++;
        }
        if(nums[i]==nums[i+1]){
            nums[i]=nums[i-1];
        }
      }
      return ans;
        
    }
}