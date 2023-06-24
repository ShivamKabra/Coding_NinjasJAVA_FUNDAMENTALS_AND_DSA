package Dynamic_Programming;

public class Fibonacci {
    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return Fib(n-1) + Fib(n-2);
    }

    public static int FibM(int n){
        int[] storage = new int[n+1];
        for(int i=0; i<n+1; i++){
            storage[i] = -1;
        }
        return FibM(n, storage);
    }

    public static int FibM(int n, int[] storage){
        if(n==0 || n==1){
            storage[n] = n;
            return storage[n];
        }
        if(storage[n]!=-1){
            return storage[n];
        }

        storage[n] = FibM(n-1)+FibM(n-2);
        return storage[n];
    }

    public static int FibDP(int n){
        int[] storage = new int[n+1];
        storage[0] =0;
        storage[1] = 1;

        for(int i=2;i<=n;i++){
            storage[n] = storage[i-1] + storage[i-2];
        }

        return storage[n];
    }

}
