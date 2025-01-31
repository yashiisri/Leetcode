import java.util.*;

class Solution {
    private Map<Integer, Integer> islandSizeMap;
    private final int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private int color_id;

    public int largestIsland(int[][] grid) {
        color_id = 2;  // Start coloring islands from 2
        int rows = grid.length;
        int cols = grid[0].length;
        islandSizeMap = new HashMap<>();

        int maxCount = 0;
        
        // Step 1: Identify all islands and store their sizes
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    int size = markIslandDFS(grid, i, j, color_id);
                    islandSizeMap.put(color_id, size); // Store the size of the island
                    maxCount = Math.max(maxCount, size);
                    color_id++;
                }
            }
        }

        // Step 2: Try converting each '0' into a '1' and calculate max island
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    maxCount = Math.max(maxCount, countIslands(grid, i, j) + 1);
                }
            }
        }
        
        return maxCount;
    }

    private int countIslands(int[][] grid, int row, int col) {
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for (int[] dir : directions) {
            int x = row + dir[0];
            int y = col + dir[1];
            if (insideBoundary(grid, x, y) && grid[x][y] > 1 && visited.add(grid[x][y])) {
                count += islandSizeMap.get(grid[x][y]);
            }
        }
        return count;
    }

    private int markIslandDFS(int[][] grid, int row, int col, int id) {
        if (!insideBoundary(grid, row, col) || grid[row][col] != 1) {
            return 0;
        }
        
        grid[row][col] = id;
        int size = 1; // Current cell counts as 1
        
        for (int[] dir : directions) {
            size += markIslandDFS(grid, row + dir[0], col + dir[1], id);
        }
        
        return size;
    }

    private boolean insideBoundary(int[][] grid, int row, int col) {
        return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length;
    }
}
