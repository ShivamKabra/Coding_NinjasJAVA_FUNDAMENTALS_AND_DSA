package Dynamic_Programming;

public class MINIMUM_NO_CHOCOLATES {
    public static int getMin(int arr[], int N) {
        // Create an array to store the minimum count of chocolates for each student
        int[] dp = new int[N];
        dp[0] = 1;

        // Calculate the minimum count of chocolates for each student starting from the second student
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                // If the current student has a higher score than the previous student,
                // give one more chocolate than the previous student
                dp[i] = 1 + dp[i - 1];
            } else {
                // If the current student has the same or lower score than the previous student,
                // give one chocolate to the current student
                dp[i] = 1;
            }
        }

        // Update the minimum count of chocolates by considering the students from right to left
        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1] && dp[i] <= dp[i + 1]) {
                // If the current student has a higher score than the next student and
                // the count of chocolates for the current student is less than or equal to the count for the next student,
                // update the count of chocolates for the current student to ensure it satisfies the condition
                dp[i] = dp[i + 1] + 1;
            }
        }

        // Calculate the total sum of chocolates distributed to all students
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            sum += dp[i];
        }

        // Return the total sum of chocolates
        return sum;
    }

}
