import java.util.Scanner;

public class Return_array_sum {
    public static int sum(int[] arr) {
        //Your code goes here
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
    public static void display(int[] disp_arr){
        for(int i=0;i<disp_arr.length;i++){
            System.out.println(disp_arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ansf[]=new int[n];
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int arr[]=new int[l];
            for(int j=0;j<l;j++){
                arr[j]=sc.nextInt();
            }
            ansf[i]=sum(arr);
        }
        display(ansf);
    }
}
