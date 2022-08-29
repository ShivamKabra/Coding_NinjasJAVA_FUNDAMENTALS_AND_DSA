import javafx.scene.transform.Scale;
/*2
        6
        2 6 8 5 4 3
        4
        2 3 4 7
        2
        10 10
        1
        10
        Sample Output 1 :
        2 4 3
        10*/



import java.util.Scanner;

public class Intersection_of_Two_Arrays_II {

    public static void intersections(int arr1[], int arr2[]) {
        //Your code goes here
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }

        }

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
            int l2=sc.nextInt();
            int inp_arr2[]=new int[l2];
            for(int j=0;j<l2;j++){
                inp_arr2[j]=sc.nextInt();
            }
            intersections(inp_arr1,inp_arr2);
        }
    }
}
