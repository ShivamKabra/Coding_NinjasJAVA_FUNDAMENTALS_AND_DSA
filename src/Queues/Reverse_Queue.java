package Queues;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Reverse_Queue {
    public static void reverseQueue(Queue<Integer> input) {
        //Your code goes here
        if(input.size()==1 || input.size()==0){
            return;
        }

        int temp=input.remove();
        reverseQueue(input);
        input.add(temp);
    }
}
