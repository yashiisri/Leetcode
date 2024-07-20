public class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.sum(3, 4);  // Example usage
        System.out.println("The sum is: " + result);  // Output: The sum is: 7
    }
}