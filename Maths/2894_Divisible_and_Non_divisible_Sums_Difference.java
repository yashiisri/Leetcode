class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10; // example value for n
        int m = 2;  // example value for m
        System.out.println(sol.differenceOfSums(n, m)); // output the result
    }
}