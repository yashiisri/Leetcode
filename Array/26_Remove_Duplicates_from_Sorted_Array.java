class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[j+1]=nums[i];
                j++;

            }
        }
        return j+1;
        
    }
}