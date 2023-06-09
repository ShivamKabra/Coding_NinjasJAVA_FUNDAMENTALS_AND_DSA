package Maps;

import java.util.HashMap;

public class PairSUmTo0 {
    public static int PairSum(int[] input, int size) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0;i<size;i++){
            if(hashmap.containsKey(input[i])){
                int value = hashmap.get(input[i]);
                value++;
                hashmap.put(input[i], value);
            }
            else{
                hashmap.put(input[i], 1);
            }
        }
        int count=0;
        for(int key : hashmap.keySet()){
            if (hashmap.containsKey(-key)) {
                if (key == 0) {
                    count = count + hashmap.get(key) * (hashmap.get(key) - 1) / 2;
                } else {
                    count = count + hashmap.get(key) * hashmap.get(-key);
                }
                hashmap.put(key, 0);
                hashmap.put(-key, 0);
            }
        }

        return count;
    }
}
