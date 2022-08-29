import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        char ch=name.charAt(0);
        int sum=0;
        int[] integers = new int[3];
        for(int i = 0; i < 3; i++)
        {
            integers[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            sum+=integers[i];
        }
        System.out.println(ch);
        System.out.println(sum/3);

    }
}
