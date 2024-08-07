class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int singlesum=0;
        int doublesum=0;
        for(int i:nums){
            if(i<10)
            singlesum+=i;
            else
            doublesum+=i;

        }
        if(singlesum==doublesum){
            return false;
        }
        return true;
        
    }
}