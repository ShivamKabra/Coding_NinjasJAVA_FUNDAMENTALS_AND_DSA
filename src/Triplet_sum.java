import java.util.Scanner;

public class Triplet_sum {
    public static int findTriplet(int[] arr, int x) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                for(int k =j+1;j<arr.length;k++){
                    if(i!=j && ((arr[i]+arr[j]+arr[k])==x)){
                        c++;
                    }
                }

            }
        }
        return (c);
        //Your code goes here
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int l1=sc.nextInt();
            int inp_arr1[]=new int[l1];
            for(int j=0;j<l1;j++){
                inp_arr1[j]=sc.nextInt();
            }
            int target=sc.nextInt();
            System.out.println(findTriplet(inp_arr1,target));
        }
    }
}

