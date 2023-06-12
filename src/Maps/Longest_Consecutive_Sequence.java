package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Longest_Consecutive_Sequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer, Boolean> hashmap = new HashMap<>();
        HashMap<Integer, Integer> lastOccurence = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i< arr.length; i++){
            hashmap.put(arr[i], true);
            lastOccurence.put(arr[i], i);
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;
        int final_start = 0;
        int final_end = 0;
        for(int i=0; i< arr.length;i++){
            int length = 0;
            int element = arr[i];
            start = arr[i];
            end = arr[i];
            if(!hashmap.get(arr[i])){
                continue;
            }
            start = element;
            length++;
            while(hashmap.containsKey(++element)){
                length++;
                end = element;
                hashmap.put(element, false);

            }

            element = arr[i];

            while(hashmap.containsKey(--element)){
                length++;
                start = element;
                hashmap.put(element, false);
            }

            if(length>maxLength || (length == maxLength && lastOccurence.get(start) < lastOccurence.get(final_start))){
                maxLength = length;
                final_start = start;
                final_end = end;
            }

        }
        ans.add(final_start);
        ans.add(final_end);

        return ans;

    }
}
