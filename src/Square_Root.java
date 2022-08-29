import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double ans=Math.pow(n,0.5);
        System.out.println((int)ans);
    }
}
