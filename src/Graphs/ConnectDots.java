package Graphs;

public class ConnectDots {
    // Function to check if a cycle is present in the given board
    int solve(String[] board , int n, int m) {
        /* Your class should be named ConnectDots
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        // Create a boolean array to track visited cells
        boolean[][] visited = new boolean[n][m];

        // Iterate through each cell in the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    // If the current cell has not been visited, check if it forms a cycle
                    if (hasCycle(board, -1, -1, i, j, visited) == 1) {
                        return 1; // If a cycle is found, return 1
                    }
                }
            }
        }

        return 0; // If no cycle is found, return 0
    }

    // Recursive function to check for a cycle starting from a given cell
    private int hasCycle(String[] board, int fromX, int fromY, int i, int j, boolean[][] visited) {
        if (visited[i][j]) {
            return 1; // If the current cell has already been visited, it indicates a cycle
        }

        visited[i][j] = true; // Mark the current cell as visited

        // Define the possible directions to move: right, down, up, left
        int[] x_direction = {1, 0, 0, -1};
        int[] y_direction = {0, 1, -1, 0};

        // Iterate through each direction
        for (int a = 0; a < x_direction.length; a++) {
            int x = x_direction[a] + i; // Calculate the new row index based on the direction
            int y = y_direction[a] + j; // Calculate the new column index based on the direction

            // Skip if the new cell is the previous cell (to avoid going back)
            if (x == fromX && y == fromY) {
                continue;
            }

            // Check if the new cell is within the bounds of the board and has the same character as the current cell
            if (x >= 0 && y >= 0 && x < board.length && y < board[x].length() && board[x].charAt(y) == board[i].charAt(j)) {
                // Recursively check for a cycle starting from the new cell
                int ans = hasCycle(board, i, j, x, y, visited);
                if (ans == 1) {
                    return 1; // If a cycle is found in the recursion, return 1
                }
            }
        }

        return 0; // If no cycle is found, return 0
    }
}
