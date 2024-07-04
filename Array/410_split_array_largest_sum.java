class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) { // Binary search for the minimum largest sum
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) { // If pieces exceed k, increase start to mid + 1
                start = mid + 1;
            } else {
                end = mid; // Otherwise, decrease end to mid
            }
        }

        return start; // Return start as the minimum largest sum
    }
    