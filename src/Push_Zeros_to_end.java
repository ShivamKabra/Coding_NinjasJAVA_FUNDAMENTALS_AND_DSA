import java.util.Scanner;

public class Push_Zeros_to_end {
    public static void pushZerosAtEnd(int[] arr) {
        //Your code goes here
        int []arr_final=new int[arr.length];
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr_final[c]=arr[i];
                c++;
            }
        }
        for(int i=0;i< arr_final.length;i++){
            System.out.print(arr_final[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
          int l=sc.nextInt();
          int []arr= new int[l];
          for(int j=0;j<l;j++){
              arr[j]= sc.nextInt();
          }
          pushZerosAtEnd(arr);
        }
    }
}
