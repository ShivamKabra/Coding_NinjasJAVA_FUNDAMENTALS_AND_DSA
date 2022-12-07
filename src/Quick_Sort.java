import java.util.*;

public class Quick_Sort {
    static Scanner s = new Scanner(System.in);
    public static int partition(int input[], int startIndex, int endInedx){
        int pivot=input[startIndex];
        int count=0;
        for(int i=startIndex+1;i<=endInedx;i++){
            if(input[i]<=pivot){
                count++;
            }
        }
        int pivotPos = startIndex +count;
        //int temp = input[startIndex];
        int temp= input[pivotPos];
        input[pivotPos]= pivot;
        input[startIndex]=temp;

        int i = startIndex;
        int j=endInedx;
        while(i<=pivotPos && j>pivotPos){
            if(input[i]<=input[pivotPos]){
                i++;
            }

            else if(input[j]>input[pivotPos]){
                j--;
            }
            else{
                int temp_=input[i];
                input[i]=input[j];
                input[j]=temp_;
                i++;j--;
            }

        }

        return pivotPos;

    }

    public static void quickSort(int[] input, int startIndex, int endInedx ){

        if(startIndex>=endInedx){
            return;
        }

        int pivotPos=partition(input, startIndex, endInedx);
        quickSort(input,startIndex,pivotPos-1);
        quickSort(input,pivotPos+1,endInedx);

    }

    public static void quickSort(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        quickSort(input, 0, input.length - 1);

    }

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void main(String[] args) {
        int[] input = takeInput();
        quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
