class Solution {
    public int alternateDigitSum(int n) {
        String nums = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < nums.length(); i++)
        {
            if(i % 2 == 0)
            {
                sum += (int)((nums.charAt(i)) - '0');
            }
            else if(i % 2 != 0)
            {
                sum -= (int)((nums.charAt(i)) - '0');
            }
        }
        return sum;
    }
}