package Leetcode;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        // Create an array to store the sum of values at each index
        int[] sum = new int[10001];

        // Calculate the sum of values for each number in nums
        for (int num : nums) {
            sum[num] += num;
        }

        // Create an array to store the maximum earn value at each index
        int[] dp = new int[10001];
        dp[0] = 0;
        dp[1] = Math.max(dp[0], sum[1]);

        // Calculate the maximum earn value for each index using dynamic programming
        for (int i = 2; i < 10001; i++) {
            dp[i] = Math.max(sum[i] + dp[i - 2], dp[i - 1]);
        }

        // Return the maximum earn value for index 10000
        return dp[10000];
    }

}
