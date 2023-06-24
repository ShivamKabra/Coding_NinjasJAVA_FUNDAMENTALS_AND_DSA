package Dynamic_Programming;

public class CountBT {
    public static int countBalancedBT(int h){
        int mod = (int)Math.pow(10,9)+7;
        return countBalancedBT(h, mod);
    }

    public static int countBalancedBT(int h, int mod) {
        if(h==0|| h==1){
            return 1;
        }
        int x = countBalancedBT(h-1, mod);
        int y = countBalancedBT(h-2, mod);
        long res1 = (long)x*x;
        long res2 = (long)x*y*2;

        int value1 = (int)(res1%mod);
        int value2 = (int)(res2%mod);

        return (value1+value2)%mod;
    }

    public static long balancedBTsDP(long height) {
        // Define the modulo value to avoid integer overflow
        long mod = (long) (Math.pow(10, 9) + 7);

        // Create an array to store the number of balanced binary trees for each height
        long[] storage = new long[(int) (height + 1)];
        storage[0] = 1; // There is only one balanced binary tree with height 0, which is an empty tree
        storage[1] = 1; // There is only one balanced binary tree with height 1, which has a single root node

        // Calculate the number of balanced binary trees for each height starting from height 2
        for (int i = 2; i <= height; i++) {
            long x = storage[i - 1]; // Number of balanced binary trees with height i-1
            long y = storage[i - 2]; // Number of balanced binary trees with height i-2

            // Calculate the square of x modulo mod
            long x_2 = (x * x) % mod;

            // Calculate the product of 2*x*y modulo mod
            long x_y_2 = (2 * x * y) % mod;

            // Calculate the total number of balanced binary trees with height i
            storage[i] = (x_2 + x_y_2) % mod;
        }

        // Return the number of balanced binary trees with the given height
        return storage[(int) height];
    }


}
