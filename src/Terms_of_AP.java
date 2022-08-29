import java.util.Scanner;

public class Terms_of_AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
          int t=3*i + 2;
          if(t%4==0){
              n=n+1;
          }
          if(t%4!=0){
              System.out.print(t+" ");
          }
        }
    }
}
