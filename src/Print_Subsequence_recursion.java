public class Print_Subsequence_recursion {

    private static void printSubsequence(String input, String outputSofar){
        if(input.isEmpty()) {
            System.out.println(outputSofar);
            return;
        }
        //recusrion without including the first character
        printSubsequence(input.substring(1),outputSofar);
        //recusrion with including the first character
        printSubsequence(input.substring(1),outputSofar+input.charAt(0));
    }

    public static void printSubsequence(String input){
        printSubsequence(input,"");
    }


    public static void main(String[] args) {
        printSubsequence("Shivam");
    }
}
