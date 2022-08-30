import java.util.Scanner;

public class Remove_character {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String Str_wc="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                Str_wc=Str_wc+str.charAt(i);
            }
        }
        return Str_wc;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.next();
        char ch=str2.charAt(0);
        System.out.println(removeAllOccurrencesOfChar(str,ch));
    }
}
