package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKelements {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        Stack<Integer> s= new Stack<>();
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<k;i++){
            s.push(input.remove());
        }
        int length= s.size();
        for(int i=0;i<length;i++){
            q.add(s.pop());
        }
        for(int a: input){
            q.add(a);
        }

        return q;
    }

}
