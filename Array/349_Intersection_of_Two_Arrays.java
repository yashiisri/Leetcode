class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        
        // Add all elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }
        
        // Check for intersection with nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num); // Add common elements to intersectionSet
            }
        }
        
        // Convert the intersectionSet to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
