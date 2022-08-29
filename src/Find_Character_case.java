import java.util.Scanner;

public class Find_Character_case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String S=sc.next();
        char ch=S.charAt(0);
        int ac= ch;

        if(ac >=65 && ac<=90){
            System.out.println(1);
        }
        else if(ac>=97 && ac<=122){
            System.out.println(0);
        }
        else
            System.out.println(-1);
    }
}
