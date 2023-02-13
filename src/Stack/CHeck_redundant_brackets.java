package Stack;

import java.util.Stack;

public class CHeck_redundant_brackets {
    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here

        Stack<Character> stack = new Stack<Character>();
        int c=0;
        for(int i=0;i<expression.length();i++){

            if(expression.charAt(i)!=')'){
                stack.push(expression.charAt(i));
            }
            else{
                while(stack.peek()!='('){
                    c++;
                    stack.pop();
                }
                stack.pop();
                if(c==0|| c==1){
                    return true;
                }
                c=0;
            }
        }

        return false;
    }
}
