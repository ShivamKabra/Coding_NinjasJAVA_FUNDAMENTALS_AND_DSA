import java.util.Scanner;

public class fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int S=sc.nextInt();
        int E=sc.nextInt();
        int W=sc.nextInt();

        for(int i=S;i<=E;i=i+W){
            int c=(5*(i-32))/9;
            System.out.println(i+" "+c);
        }

    }
}
