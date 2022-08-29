import java.util.Scanner;

public class interesting_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)((char)(65+n-1)-i+j));

            }
            System.out.println();
        }
    }
}
