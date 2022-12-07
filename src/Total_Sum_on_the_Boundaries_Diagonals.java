public class Total_Sum_on_the_Boundaries_Diagonals {
    public static void totalSum(int[][] mat) {
        //Your code goes here
        int rows=mat.length;
        int cols=mat[0].length;
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i!=j && (i==0 || j==0)){
                    sum+=mat[i][j];
                }
                if(i!=j && (i==rows-1 || j==cols-1)){
                    sum+=mat[i][j];
                }
                if(i==j){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
