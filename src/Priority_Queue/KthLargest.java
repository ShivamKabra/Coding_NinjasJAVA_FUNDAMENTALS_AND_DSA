package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static int kthLargest(int n, int[] input, int k) {
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<input.length;i++){
            pq.add(input[i]);
        }

        for(int i=0;i<k-1;i++){
            pq.remove();
        }

        return pq.remove();
    }
}

