import java.util.Arrays;
import java.util.Scanner;

public class string_permutation {

    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here
        char[] arr1=str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr2);
        String str_sorted_1 = new String(arr1);
        String str_sorted_2 = new String(arr2);
        if(str_sorted_1.equals(str_sorted_2)){
            return true;
        }

        return false;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str_1=sc.nextLine();
        String str_2=sc.nextLine();
        System.out.println(isPermutation(str_1,str_2));
    }

}
