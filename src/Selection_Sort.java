import java.util.Scanner;
/*1
        7
        2 13 4 1 3 6 28*/

public class Selection_Sort {

    public static void selectionSort(int[] arr) {
        //Your code goes here
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    min_index=j;
                }
            }
            if(min_index!=i){
                arr[min_index]=arr[i];
                arr[i]=min;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int arr[]=new int[l];
            for(int j=0;j<l;j++){
                arr[j]=sc.nextInt();
            }
            selectionSort(arr);
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
        }

    }
}
