import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void findSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: If index reaches the end, add the current subset to the result
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude the current element
        findSubsets(nums, index + 1, current, result);

        // Include the current element
        current.add(nums[index]);
        findSubsets(nums, index + 1, current, result);

        // Backtrack to remove the last added element
        current.remove(current.size() - 1);
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        
        // Print the result
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
