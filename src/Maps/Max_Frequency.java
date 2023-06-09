package Maps;

import java.util.HashMap;

public class Max_Frequency {
    public static int maxFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                int value = freq.get(arr[i]);
                value++;
                freq.put(arr[i], value);
                // continue;
            }
            else
                freq.put(arr[i], 1);
        }

        int maxO = 0;
        int max= 0;
        for(int i=0;i<arr.length;i++)
        {
            int val=freq.get(arr[i]);

            // for (int k : freq.keySet()) {
            //     if (k > max) {
            //         max = k;
            //         maxFrequency = freq.get(max);
            //     }
            if(val>max)
            {
                max=val;
                maxO=arr[i];
            }

        }
        return maxO;
        // return maxFrequency;
    }
}
