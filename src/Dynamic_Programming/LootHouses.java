package Dynamic_Programming;

public class LootHouses {
    public static int maxMoneyLooted(int[] houses) {
        // Your code goes here

        // Check if there are no houses
        if(houses.length==0){
            return 0;
        }

        // Create an array to store the maximum money looted for each house
        int[] dp = new int[houses.length];

        // Initialize the maximum money looted for the first house
        dp[0] = houses[0];

        // Initialize the maximum money looted for the second house, taking the maximum
        // of looting the first house or the second house
        dp[1] = Math.max(dp[0], houses[1]);

        // Iterate through the remaining houses, calculating the maximum money looted
        for(int i=2; i<houses.length; i++){
            // The maximum money looted for the current house is the maximum of two options:
            // 1. Looting the current house and the maximum money looted from two houses ago
            // 2. Skipping the current house and taking the maximum money looted from the previous house
            dp[i] = Math.max(houses[i] + dp[i-2], dp[i-1]);
        }

        // Return the maximum money looted from the last house
        return dp[houses.length-1];
    }
}

