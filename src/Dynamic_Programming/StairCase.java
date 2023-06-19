package Dynamic_Programming;

public class StairCase {
    public static long staircase(int n) {
        //Your code goes here
        // int[] storage = new int[n+1];
        // storage[1] = 1;
        // if(n==0){
        // 	return 1;
        // }
        // if(n==1 || n==2){
        // 	return n;
        // }

        // return staircase(n-1) + staircase(n-2) +staircase(n-3);

        long[] storage = new long[n+3];
        storage[0] = 1;
        storage[1] = 1;
        storage[2] = 2;

        // if(storage[n]!=0){
        // 	return storage[n];
        // }

        for(int i=3;i<=n;i++){
            storage[i] = storage[i-1] + storage[i-2] + storage[i-3];
        }

        return storage[n];
    }
}
