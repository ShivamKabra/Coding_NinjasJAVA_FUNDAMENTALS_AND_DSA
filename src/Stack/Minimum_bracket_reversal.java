package Stack;

import java.util.Stack;

public class Minimum_bracket_reversal {
    public static int countBracketReversals(String input) {
        //Your code goes here
        if(input.length()%2!=0){
            return -1;
        }

        Stack<Character> stack = new Stack<>();
        int count=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(input.charAt(i)=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    stack.push(ch);
                }
                else if(stack.peek()=='}'){
                    stack.push(ch);
                }
                else if(stack.peek()=='{'){
                    stack.pop();
                }

            }
        }

        while(!stack.isEmpty()){
            char c1=stack.pop();
            char c2=stack.pop();

            if(c1!=c2){
                count=count+2;
            }else{
                count++;
            }
        }
        return count;
    }
}
