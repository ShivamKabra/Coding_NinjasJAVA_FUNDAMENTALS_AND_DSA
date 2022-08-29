import java.util.Scanner;
/*1
        7
        2 13 4 1 3 6 28*/
public class Insertion_sort {
    public static void insertionSort(int[] arr) {
        //Your code goes here
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){

                   arr[j+1]=arr[j];

               j--;
            }
            arr[j+1]=temp;
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
            insertionSort(arr);
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
        }

    }
}
