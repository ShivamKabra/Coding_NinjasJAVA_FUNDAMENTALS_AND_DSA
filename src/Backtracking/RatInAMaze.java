package Backtracking;

public class RatInAMaze {
    public static boolean ratInAMaze(int maze[][]) {
        /* Your class should be named Solution.
         * Don't write main().
         * Don't take input, it is passed as function argument.
         * Don't print output.
         * Taking input and printing output is handled automatically.
         */
        int n = maze.length;
        int[][] path = new int[n][n];

        return solveMaze(maze, 0, 0, path);
    }

    private static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;

        // Check if current cell is out of bounds, blocked, or already visited
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        // Mark the current cell as visited
        path[i][j] = 1;

        // Check if we have reached the destination (bottom-right cell)
        if (i == n - 1 && j == n - 1) {
            return true;
        }

        // Recursively explore all possible paths from the current cell
        // by moving in four directions: up, right, down, left

        // Move up
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }

        // Move right
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }

        // Move down
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }

        // Move left
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }

        // If none of the paths from the current cell lead to the destination,
        // mark the current cell as unvisited and backtrack
        path[i][j] = 0;

        return false;
    }

}
