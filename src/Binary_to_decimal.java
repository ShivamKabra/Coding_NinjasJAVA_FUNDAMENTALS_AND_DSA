import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s= Integer.toString(n);
        int ans= Integer.parseInt(s,2);
        System.out.println(ans);
    }
}
