class Solution {
    public int maximumDifference(int[] nums) {
      int ans=-1;
      int max=nums[nums.length-1];
      for(int i=nums.length-2;i>=0;i--){
        max=Math.max(max,nums[i]);
        if(max<=nums[i])
        continue;
        int dif=max-nums[i];
        ans=Math.max(ans,dif);
      }
      return ans;
        
    }
}