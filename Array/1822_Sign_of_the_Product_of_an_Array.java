class Solution {
    public int arraySign(int[] nums) {
        int ans = 1;
        for (int num : nums) {
            int sign = signFunc(num);
            if (sign == 0) {
                return 0;
            }
            ans *= sign;
        }
        return ans;
    }

    public int signFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
