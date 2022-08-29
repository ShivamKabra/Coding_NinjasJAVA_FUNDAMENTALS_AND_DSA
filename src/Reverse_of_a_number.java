import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;

public class Reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s= Integer.toString(n);
        String s1=new StringBuffer(s).reverse().toString();
        System.out.println(Integer.valueOf(s1));

    }
}
