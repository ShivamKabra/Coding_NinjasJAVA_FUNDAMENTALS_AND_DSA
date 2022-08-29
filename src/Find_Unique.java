import java.util.Scanner;

public class Find_Unique {
    public static int findUnique(int[] arr){
        //Your code goes here
        for(int i=0;i< arr.length;i++){
            int target=arr[i];
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==target){
                    c++;
                }
            }
            if(c==1){
                return target;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int l= sc.nextInt();
            int input_arr[]=new int[l];
            for(int j=0;j<l;j++){
                input_arr[j]=sc.nextInt();
            }
            int ans=findUnique(input_arr);
            System.out.println(ans);
        }
    }
}
