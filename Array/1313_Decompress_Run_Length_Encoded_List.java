//Java Code
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i += 2){
            int freq = nums[i], val = nums[i + 1];
            while(freq != 0){
                 arr.add(val);
                --freq;
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}