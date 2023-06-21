package Dynamic_Programming;

public class SMALLEST_SUPER_SEQUENCE {
    public static int smallestSuperSequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Create a 2D array to store the lengths of the shortest super sequences
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the base cases:
        // The length of the shortest super sequence when one of the strings is empty
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }

        // Calculate the lengths of the shortest super sequences for each prefix of str1 and str2
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // If the current characters of both strings match,
                    // the length of the shortest super sequence is 1 plus the length of the super sequence
                    // formed by excluding these characters from both strings
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // If the current characters of both strings are different,
                    // we have two options:
                    // 1. Exclude the current character from str1 and find the length of the shortest super sequence
                    // 2. Exclude the current character from str2 and find the length of the shortest super sequence
                    // We choose the option that results in the minimum length of the super sequence
                    int op1 = dp[i - 1][j];
                    int op2 = dp[i][j - 1];
                    dp[i][j] = 1 + Math.min(op1, op2);
                }
            }
        }

        // Return the length of the shortest super sequence
        return dp[m][n];
    }

}
