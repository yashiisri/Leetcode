class Solution {
    public int maximumProduct(int[] arr) {
        int k=-1;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,min3=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){ 
            if(arr[i]>=max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>=max2 && arr[i]<max1){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>=max3 && arr[i]<max2)
            max3=arr[i];
            if(arr[i]>0)
            k=1;   
            if (arr[i] <= min1) {
            min3 = min2;
            min2 = min1;
            min1 = arr[i];
            } else if (arr[i] <= min2 && arr[i] > min1) {
            min3 = min2;
            min2 = arr[i];
           } else if (arr[i] <= min3 && arr[i] > min2) {
            min3 = arr[i];
          }
         }
         if(min1>0)
         min1=0;
         if(min2>0)
         min2=0;
         if(k==-1)
          return max1*max2*max3;
         else if(min1*min2>max1*max2)
            return min1*min2*max1;
         else if(min1*min2 > max2*max3)
            return max1*min1*min2;
         else
            return max1*max2*max3;
    }
}