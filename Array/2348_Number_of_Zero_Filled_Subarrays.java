class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i=0;
        long count=0;
      ArrayList<Long> al=new ArrayList<>();
      while(i!=nums.length){
        if(nums[i]==0){
            count++;
            i++;
            continue;

    }
        else{
            if(count!=0){
                al.add(count);
            }
            count=0;
        }
        i++;
    }
    if(nums[nums.length-1]==0){
        al.add(count);
    }
    long ans=0;
    for(Long num: al){
        ans+=(num*(num+1))/2;
    }
    return ans;
    }
}