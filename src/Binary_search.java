import java.util.Scanner;

public class Binary_search {

    public static int binarySearch(int[] arr, int l, int r, int x) {
        //Your code goes here
       if(r>=l){
           int mid=(l+r)/2;

           if(x==arr[mid]){
               return mid;
           }
           if(x>arr[mid]){
               return binarySearch(arr,mid+1,r,x);
           }
           if(x<arr[mid]){
               return binarySearch(arr,0,mid-1,x);
           }
       }
       return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int target=sc.nextInt();
            System.out.println(binarySearch(arr,0,n-1,target));
        }
    }
}
