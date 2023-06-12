package Priority_Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_Largest {
    public static ArrayList<Integer> kLargest(int input[], int k) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<input.length; i++){
            pq.add(input[i]);
        }
        for(int i=0;i<input.length-k;i++){
            pq.remove();
        }
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }

        return ans;

    }
}
