package Dynamic_Programming;

public class MagicGrid {
    public static int getMinimumStrength(int[][] grid) {
        int m = grid.length; // Number of rows in the grid
        int n = grid[0].length; // Number of columns in the grid

        // Check if grid is empty
        if (m == 0 || n == 0) {
            return 0;
        }

        int[][] storage = new int[m][n]; // Create a storage array

        // Set the minimum strength required at the destination cell
        storage[m - 1][n - 1] = 1;

        // Calculate the minimum strength required for the last column
        for (int i = m - 2; i >= 0; i--) {
            storage[i][n - 1] = Math.max(1, storage[i + 1][n - 1] - grid[i][n - 1]);
        }

        // Calculate the minimum strength required for the last row
        for (int i = n - 2; i >= 0; i--) {
            storage[m - 1][i] = Math.max(1, storage[m - 1][i + 1] - grid[m - 1][i]);
        }

        // Calculate the minimum strength required for other cells
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int ans1 = storage[i + 1][j] - grid[i][j];
                int ans2 = storage[i][j + 1] - grid[i][j];

                // Choose the minimum strength required to reach the next cell
                storage[i][j] = Math.max(1, Math.min(ans1, ans2));
            }
        }

        return storage[0][0]; // Return the minimum strength required to reach the destination cell
    }

}
