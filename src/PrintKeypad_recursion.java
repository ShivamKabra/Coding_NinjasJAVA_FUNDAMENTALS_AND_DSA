public class PrintKeypad_recursion {
    public static void printKeypad(int input, String outputsofar){
        if(input==0){
            System.out.println(outputsofar);
            return;
        }
        int newN=input%10;
        String helpans=helpAns(newN);
        printKeypad(input/10,helpans.charAt(0)+outputsofar);
        printKeypad(input/10,helpans.charAt(1)+outputsofar);
        printKeypad(input/10,helpans.charAt(2)+outputsofar);

        if(helpans.length()==4){
            printKeypad(input/10,helpans.charAt(3)+outputsofar);

        }


    }
    private static String helpAns(int newN){
        if(newN==2)
            return "abc";
        if(newN==3)
            return "def";
        if(newN==4)
            return "ghi";
        if(newN==5)
            return "jkl";
        if(newN==6)
            return "mno";
        if(newN==7)
            return "pqrs";
        if(newN==8)
            return "tuv";
        if(newN==9)
            return "wxyz";
        else
            return "";
    }

    public static void printKeypad(int input){
        // Write your code here
        printKeypad(input,"");

    }
    public static void main(String[] args) {
          printKeypad(234);
    }
}
