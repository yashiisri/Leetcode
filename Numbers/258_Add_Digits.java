class Solution {
    public int addDigits(int num) {
        if( num<=9){
            return num;
        }
        int x=num%9;
        if(x==0){
            return 9;
        }else{
            return x;
        }
        }
        
    }
