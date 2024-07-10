class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int diagonalSq=0, area=0;
        for(int[] d:dimensions){
            int ds=d[0]*d[0]+d[1]*d[1];
            int ar=d[0]*d[1];
            if(ds>diagonalSq){
                area=ar;
                diagonalSq=ds;
            }else if(ds==diagonalSq && ar>area){
                area=ar;
            }

        }
        
        return area;
    }
}