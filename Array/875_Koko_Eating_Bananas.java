class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;  // Minimum speed should be at least 1
        int right = getMaxPile(piles);  // Maximum speed should be the largest pile

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEatInTime(piles, mid, h)) {
                right = mid - 1; // Try a smaller speed
            } else {
                left = mid + 1; // Increase the speed
            }
        }
        return left; // Minimum required speed
    }

    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
private boolean canEatInTime(int[] piles, int k, int h) {
    long hours = 0; // Use long to prevent overflow
    for (int pile : piles) {
        hours += (pile + (long) k - 1) / k; // Ensure division is done in long
        if (hours > h) return false; // No need to continue checking
    }
    return hours <= h;
}

}
