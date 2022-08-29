import java.util.Scanner;

public class Check_Number_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int first_num= sc.nextInt();
        boolean isDec=true;
        int count=0;
        for(int i=1;i<=n-1;i++){
            int curr_num=sc.nextInt();

            if(curr_num==first_num){
                System.out.println(false);
                return;
            }
            else if(first_num<curr_num){
                if(isDec){
                    count++;
                    isDec=false;
                }
            }
            else{
                if(!isDec){
                    System.out.println(false);
                    return;
                }
            }
            first_num=curr_num;
        }
        if(count==1&&isDec==false || count==0 && isDec==true || count==0 && isDec==false) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
