package Dynamic_Programming;

public class MinimumCostPath {
    public static int minCostRecursive(int[][] arr){
        return minCostRecursive(arr, 0, 0);
    }

    private static int minCostRecursive(int[][] arr, int i, int j) {
        int m= arr.length;
        int n = arr[0].length;

        if(i==m-1 && j==n-1){
            return arr[i][j];
        }
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }

        int op1 = minCostRecursive(arr, i+1, j);
        int op2 = minCostRecursive(arr, i+1, j+1);
        int op3 = minCostRecursive(arr, i, j+1);

        return arr[i][j] + Math.min(op1, Math.min(op2,op3));
    }

    public static int minCostMemo(int[][] arr){
        int[][] storage = new int[arr.length-1][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                storage[i][j]=-1;
            }
        }
        return minCostMemo(arr,0,0,storage);
    }

    private static int minCostMemo(int[][] arr, int i, int j, int[][] storage) {
        int m = arr.length;
        int n= arr[0].length;

        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }

        if(i==m-1 && j==n-1 ){
            storage[i][j] = arr[i][j];
            return storage[i][j];
        }

        if(storage[i][j]!=-1){
            return storage[i][j];
        }
        int op1 = minCostMemo(arr, i+1, j, storage);
        int op2 = minCostMemo(arr, i+1, j+1, storage);
        int op3 = minCostMemo(arr, i, j+1, storage);

        storage[i][j] = arr[i][j] + Math.min(op1, Math.min(op2,op3));
        return storage[i][j];

    }

    public static int MinCostPathDP(int[][] arr){
        int m= arr.length;
        int n=arr[0].length;
        int[][] storage = new int[m][n];

        storage[m-1][n-1] = arr[m-1][n-1];
        for(int j=n-2;j>=0;j--){
            storage[m-1][j] = storage[m-1][j+1] + arr[m-1][j];
        }
        for(int i=m-2;i>=0;i--){
            storage[i][n-1] = storage[i+1][n-1] + arr[i][n-1];
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                storage[i][j] = arr[i][j] + Math.min(storage[i+1][j+1], Math.min(storage[i+1][j], storage[i][j+1]));
            }
        }
        return storage[0][0];
    }

}
