class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int a=0;
         String s1="--X";  
         String s2="++X";  
         String s3="X--";  
         String s4="X++"; 
        for(int i=0;i<n;i++)
        {
            if(operations[i].equals(s1)||operations[i].equals(s3))
                a--;
            else if(operations[i].equals(s2)||operations[i].equals(s4))
                a++;
        }
        return a;
    }
}