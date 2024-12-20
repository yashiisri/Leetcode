class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        if (num <= 18) {
            if (num%2 == 0) return true;
        }
        if (num >= 11 && num <= 198) {
            if (num%11 == 0) return true;
        }
        if (num >= 101 && num <= 1998) {
            int y = 0;
            while (y < 10) {
                if ((num - y*20) % 101 == 0) return true;
                y++;
            }
        }
        if (num >= 1001 && num <= 19998) {
            int y = 0;
            while (y < 19) {
                if ((num - y*110) % 1001 == 0) return true;
                y++;
            }
        }
        if (num >= 10001) {
            int z = 0;
            int y;
            while (z < 10) {
                y = 0;
                while (y < 19) {
                    if ((num - z*200 - y*1010) % 10001 == 0) return true;
                    y++;
                }
                z++;
            }
        }
        return false;

    }
}