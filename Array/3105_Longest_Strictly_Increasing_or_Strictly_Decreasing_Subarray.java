class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int res=1;
        int inc=1;
        int dec=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                dec=1;
            }else if(nums[i]<nums[i-1]){
                dec++;
                inc=1;
            }else{
                inc=1;
                dec=1;
            }
            res=Math.max(res,Math.max(inc,dec));
        }
        return res;
        
    }
}