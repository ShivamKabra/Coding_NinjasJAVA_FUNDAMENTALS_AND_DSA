package Dynamic_Programming;

public class MaxSquareWithAllZeroes {
    public static int findMaxSquareWithAllZeros(int[][] input) {
        if (input.length == 0)
            return 0;
        int m = input.length;
        int n = input[0].length;
        int[][] dp = new int[m][n];

        // Initialize the first row and column of the dp array based on the input matrix
        for (int i = 0; i < m; i++) {
            if (input[i][0] == 0) {
                dp[i][0] = 1; // If the element in the input matrix is 0, set the corresponding dp value to 1
            } else {
                dp[i][0] = 0; // If the element in the input matrix is 1, set the corresponding dp value to 0
            }
        }
        for (int i = 0; i < n; i++) {
            if (input[0][i] == 0) {
                dp[0][i] = 1; // If the element in the input matrix is 0, set the corresponding dp value to 1
            } else {
                dp[0][i] = 0; // If the element in the input matrix is 1, set the corresponding dp value to 0
            }
        }

        // Calculate the maximum size of the square sub-matrix with all 0s
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (input[i][j] == 1) {
                    dp[i][j] = 0; // If the element in the input matrix is 1, set the corresponding dp value to 0
                } else {
                    // If the element in the input matrix is 0,
                    // calculate the size of the square sub-matrix with all 0s
                    // using the values of dp array from the top, left, and top-left diagonal elements
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        int max = Integer.MIN_VALUE;
        // Find the maximum value in the dp array, which represents the size of the maximum square sub-matrix with all 0s
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] >= max) {
                    max = dp[i][j];
                }
            }
        }

        return max;
    }

}
