class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                char[] arr=s2.toCharArray();

                char temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                if(s1.equals(new String(arr))){
                    return true;
                }
            }
        }
        return false;
        
    }

}