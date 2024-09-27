class Solution {
    public int arrangeCoins(int n) {
         int count = 0;
        int row = 1;

        // Continue adding rows until we don't have enough coins for the next row
        while (n >= row) {
            n -= row;  // Subtract the number of coins needed for the current row
            row++;     // Move to the next row
            count++;   // Increment the count of complete rows
        }

        return count;
    }
}