// In java array i sort decreasing order
// then perform same operations in reverse
// you can sort arry in non decreasing order using collections
//Arrays.sort(numsInteger, Collections.reverseOrder())
class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= (n - i)) {
                if (i == 0 || nums[i - 1] < (n - i)) {
                    return n - i;
                }
            }
        }
        return -1;
    }
}