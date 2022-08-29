import java.util.Scanner;

public class Diamond_of_stars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=(n+1)/2;

        for(int i=1;i<=f;i++){

            for(int j=1;j<=f-i;j++){
                System.out.print(" ");
            }
            int p=i;
            for(int j=1;j<=i;j++){
                System.out.print("*");
                p++;
            }
            int k=p-2;
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
                k--;
            }
            System.out.println();
        }
        int sec= n-f;
        int temp=sec;
        for(int i=1;i<=sec;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=temp;j++){
                System.out.print("*");
            }
            temp--;
            for(int j=1;j<=sec-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
