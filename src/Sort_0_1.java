import java.util.Scanner;

public class Sort_0_1 {
    public static int[] sortZeroesAndOne(int[] arr) {
        //Your code goes here
        int c=0;
        int arr_ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                arr_ans[c]=0;
                c++;
            }
        }
        for(int i=0;i<arr.length;i++){

            if(arr[i]==1){
                arr_ans[c]=1;
                c++;
            }
        }
        return arr_ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i = 0 ;i<n;i++){
            int l=sc.nextInt();
            int arr[]= new int[l];
            for(int j=0;j<l;j++){
                arr[j]=sc.nextInt();
            }
            int disp_arr[]=new int[l];
            disp_arr=sortZeroesAndOne(arr);
            for(int k=0;k<l;k++){
                System.out.print(disp_arr[k]+" ");
            }
        }
    }
}
