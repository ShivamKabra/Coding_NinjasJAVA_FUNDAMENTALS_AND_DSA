package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static ArrayList<Integer> remove_duplicates(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
        for(int i=0;i<arr.length;i++){
            if(seen.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            seen.put(arr[i], true);
        }

        return output;
    }
}
