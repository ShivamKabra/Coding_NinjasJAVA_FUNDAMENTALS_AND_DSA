import java.util.Scanner;

public class Bubble_sort {
    public static void bubbleSort(int[] arr){
        //Your code goes here
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int arr[]=new int[l];
            for(int j=0;j<l;j++){
                arr[j]=sc.nextInt();
            }
            bubbleSort(arr);

            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
            System.out.println(arr[arr.length-2]);
        }

    }
}
