package Dynamic_Programming;

public class SUBSET_SUM {
    public static boolean subset_sum(int[] arr, int n, int sum) {
        // Base case: If there are no elements left in the array
        if (n == 0) {
            // If the desired sum is also 0, it means we have found a subset
            if (sum == 0) {
                return true;
            } else {
                // If the desired sum is not 0, it means we have not found a subset
                return false;
            }
        }

        // Base case: If the desired sum is 0, it means we have found a subset
        if (sum == 0) {
            return true;
        }

        // Base case: If the desired sum is negative, it means we have not found a subset
        if (sum < 0) {
            return false;
        }

        // Recursive case:
        // Check two options:
        // 1. Include the current element in the subset and reduce the sum by the value of the current element
        boolean op1 = subset_sum(arr, n - 1, sum - arr[n - 1]);

        // 2. Exclude the current element from the subset and keep the sum unchanged
        boolean op2 = subset_sum(arr, n - 1, sum);

        // Return true if either of the two options is true
        return op1 || op2;
    }

    public static boolean subset_sumDP(int[] arr, int n, int sum) {
        // Create a 2D array to store the intermediate results
        boolean[][] storage = new boolean[n+1][sum+1];

        // Initialize the base cases:
        // If there are no elements and the desired sum is 0, it is possible to form an empty subset
        storage[0][0] = true;

        // If there are no elements, it is not possible to form a subset with a non-zero sum
        for (int i = 1; i <= n; i++) {
            storage[i][0] = true;
        }

        // If the desired sum is non-zero and there are no elements, it is not possible to form a subset
        for (int i = 1; i <= sum; i++) {
            storage[0][i] = false;
        }

        // Iterate through the array elements and desired sum to fill the storage array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                boolean ans;
                if (j >= arr[i - 1]) {
                    // If the current element can be included in the subset, check two options:
                    // 1. Include the current element and reduce the sum by the value of the current element
                    boolean ans1 = storage[i - 1][j - arr[i - 1]];

                    // 2. Exclude the current element and keep the sum unchanged
                    boolean ans2 = storage[i - 1][j];

                    // Update the intermediate result based on whether either of the options is true
                    ans = ans1 || ans2;
                } else {
                    // If the current element is larger than the desired sum, exclude it and keep the sum unchanged
                    ans = storage[i - 1][j];
                }

                // Store the intermediate result in the storage array
                storage[i][j] = ans;
            }
        }

        // Return the final result from the storage array
        return storage[n][sum];
    }


}
