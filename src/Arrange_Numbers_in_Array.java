import java.util.Scanner;

public class Arrange_Numbers_in_Array {
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        if(n%2==0){
            int val=1;
            int s=0;
            int e=n-1;
            for(int i=0;i<n/2;i++){
                arr[s]=val;
                val++;
                arr[e]=val;
                val++;
                s++;
                e--;
            }
        }
        if(n%2!=0){
            int val=1;
            int s=0;
            int e=n-1;
            for(int i=0;i<n/2;i++){
                arr[s]=val;
                val++;
                arr[e]=val;
                val++;
                s++;
                e--;
            }
            arr[s]=val;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int inp_arr[]=new int[m];
            arrange(inp_arr,m);
        }
    }
}
