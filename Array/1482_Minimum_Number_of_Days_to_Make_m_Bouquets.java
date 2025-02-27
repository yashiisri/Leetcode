class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // If it's impossible to form m bouquets (each requires k flowers):
        if (m * k > bloomDay.length) {
            return -1;
        }
        
        // Find the maximum bloom day in the array
        int maxDay = 0;
        for (int day : bloomDay) {
            maxDay = Math.max(maxDay, day);
        }

        // Binary search range: from day 1 to the max bloom day
        int l = 1, r = maxDay;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int bouquets = 0, consecutive = 0;

            // Count how many bouquets can be formed by day 'mid'
            for (int day : bloomDay) {
                if (day <= mid) {
                    consecutive++;
                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                } else {
                    consecutive = 0;
                }
            }

            // If we can form at least m bouquets by 'mid', try fewer days
            if (bouquets >= m) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
