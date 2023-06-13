package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Running_Median {
    public static void findMedian(int arr[])  {


        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();

        int i=0;

        while(i<arr.length){
            if(maxPQ.isEmpty() && minPQ.isEmpty()){
                maxPQ.add(arr[i]);
                System.out.print(arr[i]+" ");
            }

            else if(maxPQ.size()!=0 && minPQ.size()==0){
                maxPQ.add(arr[i]);
                minPQ.add(maxPQ.remove());
                int max = maxPQ.peek();
                int min = minPQ.peek();
                System.out.print((max+min)/2+" ");
            }

            else if(maxPQ.size()!=0 && minPQ.size()!=0){
                int num = arr[i];
                int max = maxPQ.peek();
                int min =  minPQ.peek();
                if(num<max){
                    maxPQ.add(num);
                }else{
                    minPQ.add(num);
                }

                max = maxPQ.peek();
                min = minPQ.peek();

                if(maxPQ.size()-minPQ.size()>1){
                    minPQ.add(maxPQ.remove());
                    max = maxPQ.peek();
                    min = minPQ.peek();
                    System.out.print((max+min)/2+" ");
                }

                else if(minPQ.size()-maxPQ.size()>1){
                    maxPQ.add(minPQ.remove());
                    max = maxPQ.peek();
                    min = minPQ.peek();
                    System.out.print((max+min)/2+" ");
                }

                else if(maxPQ.size()==minPQ.size()){
                    System.out.print((max+min)/2+" ");
                }

                else if(maxPQ.size()>minPQ.size()){
                    System.out.print(max+" ");
                }
                else if(minPQ.size()>maxPQ.size()){
                    System.out.print(min+" ");
                }


            }
            i++;
        }

    }

}
