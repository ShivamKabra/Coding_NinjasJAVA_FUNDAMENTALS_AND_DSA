import java.util.Scanner;

public class Total_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s= sc.next();
        char ch= s.charAt(0);
        double totalSalary;
        if(ch=='A'){
            totalSalary= n+ (0.2*n)+ (0.5*n)+ 1700 - (0.11*n);
            System.out.println((int)(Math.round(totalSalary)));
            System.exit(0);
        }
        else if (ch=='B'){
            totalSalary= n+ (0.2*n)+ (0.5*n)+ 1500 - (0.11*n);
            System.out.println((int)(Math.round(totalSalary)));
            System.exit(0);
        }
        else {
            totalSalary= n+ (0.2*n)+ (0.5*n)+ 1300 - (0.11*n);
            System.out.println((int)(Math.round(totalSalary)));
            System.exit(0);
        }
    }
}
