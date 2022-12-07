public class Largest_Row_or_Column {

    public static void findLargest(int mat[][]){
        //Your code goes here
        int column_index=0;
        int row_index = 0;
        int row_sum_max=Integer.MIN_VALUE;
        int column_sum_max=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            int row_sum=0;
            int col_sum=0;
            int j1=0;
            for(int j=0;j<mat[0].length;j++){
                row_sum+=mat[i][j];
                col_sum+=mat[j][i];
                j1=j;
            }
            if(row_sum>row_sum_max){
                row_sum_max=row_sum;
                row_index=i;
            }
            if(col_sum>column_sum_max){
                column_sum_max=col_sum;
                column_index=j1;
            }
        }
        if(row_sum_max>column_sum_max){
            System.out.println("row "+row_index+" "+row_sum_max);
        }
        else{
            System.out.println("column "+column_index+" "+column_sum_max);
        }

    }

}
    /*Sample Input 2 :
        2
        3 3
        3 6 9
        1 4 7
        2 8 9
        4 2
        1 2
        90 100
        3 40
        -10 200
        Sample Output 2 :
        column 2 25
        column 1 342*/