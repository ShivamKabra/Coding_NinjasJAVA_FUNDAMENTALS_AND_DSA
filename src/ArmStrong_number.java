import java.util.Scanner;

public class ArmStrong_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();


        int temp=n;
        int last=0;
        int digits=0;
        int sum=0;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum=sum+(int)Math.pow(temp,digits);
            temp=temp/10;
        }
        if(n==sum)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
