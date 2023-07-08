package Backtracking;

public class RatInAMazeAllPaths {
    static void ratInAMaze(int maze[][], int n) {
        /*
         * Your class should be named Solution.
         * Write your code here
         */
       int[][] path = new int[n][n];
       printAllPaths(maze,0,0,path, n);

    }

    private static void printAllPaths(int[][] maze, int i, int j, int[][] path, int n) {
        if(i<0 || j<0 || j>= maze.length || i>= maze.length || maze[i][j]==0 || path[i][j]==1){
            return;
        }
        //int n = maze.length;
        path[i][j] = 1;
        if(i==n-1 && j==n-1){
            for(int r=0; r<n; r++){
                for(int c=0; c<n; c++){
                    System.out.print(path[i][j]+" ");
                }
            }
            path[i][j] = 0;
            return;
        }

        printAllPaths(maze, i-1, j, path,n);
        printAllPaths(maze, i, j+1, path, n);
        printAllPaths(maze, i+1, j, path, n);
        printAllPaths(maze, i, j-1, path, n);

        path[i][j]=0;
        return;
    }

}
