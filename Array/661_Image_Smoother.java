class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int[][] image = new int[n][m];

        // Iterate through each cell in the image
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                int count = 0;

                // Iterate through the 3x3 grid centered at the current cell
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        int nrow = i + k;
                        int ncol = j + l;

                        // Check if the surrounding cell is valid
                        if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m) {
                            sum += img[nrow][ncol];
                            count++;
                        }
                    }
                }

                // Calculate the average and round down
                double num = Math.floor((sum / count));
                
                // Set the corresponding cell in the new image to the calculated average
                image[i][j] = (int) num;
            }
        }

        return image;
    }
}