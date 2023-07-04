package Backtracking;

public class NQueens {
    public static void placeNQueens(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Print output as specified in the question
         */
        int[][] board = new int[n][n];
        solveNQueens(board, 0, n);

    }

    private static void solveNQueens(int[][] board, int row, int n) {
        if(row==n){
            printBoard(board, n);
            return;
        }

        for(int i=0;i < n; i++){
            if(isSafe(board, row, i, n)){
                board[row][i] = 1;

                solveNQueens(board, row+1, n);

                board[row][i] = 0;
            }
        }

        return;
    }



    private static boolean isSafe(int[][] board, int row, int col, int n) {
        int i,j;
        // checking that column
        for( i=0;i<row;i++){
            if(board[i][col]==1){
                return false;
            }
        }
        // upper left
        for( i= row,  j =col; i>=0 && j >=0 ; i--, j-- ){
            if(board[i][j]==1){
                return false;
            }
        }
        // upper right
        for(i= row, j=col; i>=0 && j<n; i--, j++){
            if(board[i][j]==1){
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}

