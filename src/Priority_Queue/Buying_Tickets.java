package Priority_Queue;

//import sun.misc.Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Buying_Tickets {
    public static int buyTicket(int input[], int k) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int time = 0;
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i< input.length;i++){
            q.add(i);
            pq.add(input[i]);
        }

        while(!q.isEmpty()){
            if(input[q.peek()] < pq.peek()){
                q.add(q.remove());
            }else{
                int idx = q.remove();
                pq.remove();
                time++;
                if(idx==k){
                    break;
                }
            }
        }

        return time;

    }
}
