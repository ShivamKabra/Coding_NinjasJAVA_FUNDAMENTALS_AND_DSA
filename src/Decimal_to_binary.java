import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String binary=Integer.toBinaryString((int) n);
        System.out.println(binary);
    }
}
