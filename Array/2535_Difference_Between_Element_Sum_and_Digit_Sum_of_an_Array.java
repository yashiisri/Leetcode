class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum=0;
        int digit_sum=0;

        for(int i=0;i<nums.length;i++){
            element_sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                int add=nums[i],rem=0;
                while(add!=0){
                    rem=add%10;
                    digit_sum+=rem;
                    add/=10;
                }
            }
            else{
                digit_sum+=nums[i];
            }
        }
        return Math.abs(element_sum-digit_sum);
        
    }
}