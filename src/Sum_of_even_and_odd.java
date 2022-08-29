import java.util.Scanner;

public class Sum_of_even_and_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String S=Integer.toString(N);
        //String S= sc.next();
        int Sum_E=0;
        int Sum_O=0;
        for(int i=0;i<S.length();i++){
            char ch= S.charAt(i);
            int j= Character.getNumericValue(ch);
            if((i+1)%2==0){
                Sum_E=Sum_E+j;
            }
            else{
                Sum_O=Sum_O+j;
            }
        }
        System.out.println(Sum_E+" "+Sum_O);
    }
}
