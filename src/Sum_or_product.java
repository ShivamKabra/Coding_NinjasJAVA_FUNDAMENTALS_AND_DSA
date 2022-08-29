import java.util.Scanner;

public class Sum_or_product {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();

        if(c==1){
            int sum=0;
            for(int i=1;i<=n;i++){
              sum=sum+i;
            }
            System.out.println(sum);
        }
        else if(c==2){
            int pro=1;

            for(int i=1;i<=n;i++){
               pro=pro*i;
            }
            System.out.println(pro);
        }
        else
            System.out.println(-1);
    }
}
