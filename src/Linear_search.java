import java.util.Scanner;

public class Linear_search {
    public static int linearSearch(int arr[], int x) {
        //Your code goes here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;

    }
    public static void display(int dis_arr[]){
        for(int i=0;i<dis_arr.length;i++){
            System.out.println(dis_arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans_arr[]= new int[n];
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int inp_arr[]=new int[l];

            for(int j=0;j<l;j++){
                inp_arr[j]=sc.nextInt();
            }
            int target= sc.nextInt();

            ans_arr[i]= linearSearch(inp_arr,target);
        }
         display(ans_arr);

    }
}
