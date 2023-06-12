package Maps;

import java.util.HashMap;

public class Pairs_with_sum_k {
    public static int getPairsWithDifferenceK(int arr[], int k) {
        //Write your code here
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hashmap.containsKey(arr[i])){
                int value = hashmap.get(arr[i]);
                value++;
                hashmap.put(arr[i], value);
            }
            else{
                hashmap.put(arr[i], 1);
            }
        }
        int count=0;

        for(int key : hashmap.keySet()){
            //int target = Math.abs(key - k);
            int target1 = key-k;
            int target2 = key+k;

            if(hashmap.containsKey(target1)){
                if(target1==key && target2==key){
                    count=count+(hashmap.get(key)*(hashmap.get(key)-1))/2;
                    //hashmap.put(target1, 0);
                    hashmap.put(key,0);
                    //hashmap.put(target2, 0);
                }
                else{
                    count=count+ hashmap.get(key)*hashmap.get(target1);
                    hashmap.put(target1, 0);
                    //hashmap.put(target2, 0);
                    if(!hashmap.containsKey(target2)){
                        hashmap.put(key,0);
                    }
                }
            }
            else if(hashmap.containsKey(target2)){
                count=count+ hashmap.get(key)*hashmap.get(target2);
                //hashmap.put(target2, 0);
                hashmap.put(key, 0);
            }

        }


        return count;
    }
}
