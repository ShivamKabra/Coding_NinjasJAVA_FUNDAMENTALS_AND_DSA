import java.util.Scanner;

public class Number_star_pattern_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
        int t=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(c==j){
                    System.out.print("*");

                }
                else{
                    System.out.print(t);
                }
               t--;
            }
            t=n;
            c--;
            System.out.println();
        }
    }
}
