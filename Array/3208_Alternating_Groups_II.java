class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        // Extend the colors array to handle the circular nature
        int[] extended = new int[colors.length + k - 1];
        
        // Copy the original colors array into the extended array
        for (int i = 0; i < colors.length; i++) {
            extended[i] = colors[i];
        }
        
        // Append the first (k - 1) elements to the end to simulate circular behavior
        for (int i = 0; i < k - 1; i++) {
            extended[colors.length + i] = colors[i];
        }
        
        int n = extended.length; // New extended array size
        int i = 0, j = 0; // Two pointers for the sliding window
        int ans = 0; // Counter for the alternating groups
        
        while (j < n - 1) {
            // If two consecutive tiles have the same color, reset the window
            if (extended[j] == extended[j + 1]) {
                j = j + 1;
                i = j;
                continue;
            }
            j++; // Expand the window
            
            // If window size is smaller than k, continue expanding
            if (j - i + 1 < k) continue;
            
            // Valid alternating group found, increment the count
            ans++; 
            i++; // Slide the window forward
        }
        
        return ans; // Return total count of alternating groups
    }
}