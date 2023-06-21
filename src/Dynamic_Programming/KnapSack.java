package Dynamic_Programming;

public class KnapSack {
    public static int knapSackRec(int[] weights, int[] values, int maxWeight){
        return knapSackRec(weights, values, maxWeight, 0);
    }

    private static int knapSackRec(int[] weights, int[] values, int maxWeight, int i) {
        if(i==weights.length || maxWeight==0){
            return 0;
        }

        if(weights[i]>maxWeight){
            return knapSackRec(weights, values, maxWeight, i+1);
        }else{
            int op1 =values[i] + knapSackRec(weights, values, maxWeight-weights[i], i+1);
            int op2 = knapSackRec(weights, values, maxWeight, i+1);
            return Math.max(op1,op2);
        }
    }

    public static int knapSackDP(int[] weight, int[] values, int maxWeight){
        int n = weight.length;
        int[][] storage = new int[n+1][maxWeight+1];

        for(int i=n-1;i>=0;i--){
            for(int w=0; w<=maxWeight;w++){
                if(weight[i]<=w){
                    int op1 = values[i]+storage[i+1][w-weight[i]];
                    int op2 = storage[i+1][w];
                    storage[i][w] = Math.max(op1,op2);
                }else{
                    storage[i][w] = storage[i+1][w];
                }
            }
        }
        return storage[0][maxWeight];
    }
}
