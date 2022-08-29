import java.util.Scanner;

public class Rotate_array {
    public static void rotate(int[] arr, int d) {
        //Your code goes here
        int arr_ans[]=new int[arr.length];
        int r=d;
        int c=0;
        System.out.println(r);
        for(int i=d;i<arr.length;i++){
            arr_ans[c]=arr[i];
            c++;
        }
        for(int i =0;i<d;i++){
            arr_ans[c]=arr[i];
            c++;
        }
        for(int i=0;i<arr_ans.length;i++){
            System.out.print(arr_ans[i]+" ");
        }
        return;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i =0;i<n;i++){
            int l=sc.nextInt();
            int arr[]=new int[l];
            for(int j=0;j<l;j++){
                arr[i]=sc.nextInt();
            }
            int d=sc.nextInt();
            rotate(arr,d);
        }
    }
}
