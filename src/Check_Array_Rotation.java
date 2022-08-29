import java.util.Arrays;
import java.util.Scanner;

public class Check_Array_Rotation {
    public static int arrayRotateCheck(int[] arr){
        int []arr_copy= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr_copy[i]=arr[i];
        }
        Arrays.sort(arr_copy);
        //Your code goes here

        int c=0;
        for(int i=0;i<arr.length;i++){
            if(Arrays.equals(arr,arr_copy)){
                return c;
            }
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int []arr=new int[l];
            for(int j=0;j<l;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(arrayRotateCheck(arr));
        }
    }
}
