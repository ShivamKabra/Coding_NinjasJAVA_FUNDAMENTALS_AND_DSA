package Dynamic_Programming;

public class MinNumber_Of_Squares {
    // public static int minCount(int n) {
    // 	//Your code goes here
    // 	if(n==1 || n==0){
    // 		return n;
    // 	}
    // 	int min = Integer.MAX_VALUE;

    // 	for(int i=1; i<=(int)Math.sqrt(n); i++){
    // 		int count = minCount(n-(i*i));
    // 		if(count<min){
    // 			min=count;
    // 		}
    // 	}

    // 	return min+1;
    // }

    public static int minCount(int n) {

        int[] storage = new int[n+1];
        return minCountMemo(n,storage);
    }
    public static int minCountMemo(int n,int[] storage) {
        if(n==0 || n==1) {
            storage[n] = n;
            return storage[n];
        }
        if(storage[n]!=0) {
            return storage[n];
        }
        int min= Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(n);i++) {
            int count = minCountMemo(n-(i*i), storage);
            if(min>count)
                min=count;
        }
        storage[n] = min + 1;
        return storage[n];

    }
    public static int minCountDP(int n) {
        int[] storage  = new int[n+1];
        storage[0]=0;
        storage[1] =1;
        for(int i=2;i<=n;i++) {
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=Math.sqrt(i);j++) {
                int count = storage[i-(j*j)];
                if(min > count) {
                    min = count;
                }

            }
            storage[i] = min + 1;

        }
        return storage[n];
    }

}
