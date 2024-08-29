class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int c=0;
        for(int i=0;i<n;i++){
            if(!map.isEmpty() && map.containsKey(nums[i])){
                c+=map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return c;
    }
}