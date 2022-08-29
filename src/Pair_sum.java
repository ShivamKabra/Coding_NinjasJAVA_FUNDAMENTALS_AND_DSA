import java.util.Scanner;

public class Pair_sum {

    public static int pairSum(int arr[], int x) {
        //Your code goes here
        int c=0;
        for(int i=0;i<arr.length-1;i++){
          for(int j=i+1;j< arr.length;j++){
              if(arr[i]+arr[j]==x){
                  c+=1;
              }
          }
        }
        return c;
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
            System.out.println(pairSum(inp_arr1,target));
        }
    }
}
