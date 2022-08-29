import java.util.Scanner;


public class reverse_string_wordwise {
    public static String reverseWordWise(String input) {
       String rev_string="";
       String[] words=input.split(" ");
       for(int i=words.length-1;i>=0;i--){
           rev_string=rev_string+words[i];
           rev_string=rev_string+" ";
       }
       return rev_string.substring(0,rev_string.length());

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String rev_str=reverseWordWise(str);
        System.out.println(rev_str);
    }
}
