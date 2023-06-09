package Maps;

import java.util.HashMap;

public class Print_Intersection {
    public static void printIntersection(int[] arr1,int[] arr2){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(hashmap.containsKey(arr1[i])){
                int value = hashmap.get(arr1[i]);
                value++;
                hashmap.put(arr1[i], value);
            }
            else{
                hashmap.put(arr1[i], 1);
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(hashmap.containsKey(arr2[i]) && hashmap.get(arr2[i])!=0){
                System.out.println(arr2[i]);
                int value = hashmap.get(arr2[i]);
                value--;
                hashmap.put(arr2[i], value);
            }
        }
    }
}
