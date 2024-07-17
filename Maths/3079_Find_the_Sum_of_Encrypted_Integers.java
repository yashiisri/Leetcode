class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int elements:nums){
            sum+=encrypt(elements);

        }
        return sum;
        
    }
    static int encrypt(int x){
        int result=0;
        int largest_element=0;
        int number_of_element=0;
        while(x!=0){
            int remainder=x%10;
            if(remainder>largest_element){
                largest_element=remainder;
            }
            number_of_element++;
            x=x/10;
        }
       while(number_of_element!=0){
        result=result*10+largest_element;
        number_of_element--;
       }
       return result;
    }
}