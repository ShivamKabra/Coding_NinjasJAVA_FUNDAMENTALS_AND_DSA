import java.util.Scanner;

public class Remove_Consecutive_Duplicates {
    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here
        String str_wc=""+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                str_wc=str_wc+str.charAt(i);
            }
        }
        return str_wc;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
