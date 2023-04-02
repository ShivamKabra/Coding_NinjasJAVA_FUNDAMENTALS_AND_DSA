package Stack;

import java.util.Stack;

public class Stock_Span {
    public static int[] stockSpan(int[] price) {
        //Your code goes here
        int[] span = new int[price.length];
        span[0]=1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=1;i< price.length;i++){

            while(!stack.isEmpty() && price[stack.peek()]<price[i]){
                stack.pop();
            }


            if(stack.isEmpty()){
                span[i]= i+1;
            }
            else{
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }
}
