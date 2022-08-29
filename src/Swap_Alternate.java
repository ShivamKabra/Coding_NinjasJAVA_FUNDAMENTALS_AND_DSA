import java.util.Scanner;

public class Swap_Alternate {
    public static int[] swapAlternate(int arr[]) {
        //Your code goes here
        int temp;
        for(int i=0;i<(2*arr.length-1)/2;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int input_arr[]= new int[l];
            for(int j=0;j<l;j++){
                input_arr[j]=sc.nextInt();
            }
            int ans_arr[]= new int[l];
            ans_arr=swapAlternate(input_arr);
            for(int j=0;j<l;j++){
                System.out.print(ans_arr[j]+" ");
            }
        }
    }
}
