package Graphs;

public class LargestPiece {
    public static int dfs(String[] edge, int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        boolean[][] visited = new boolean[n][n];
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && edge[i].charAt(j)=='1'){
                    int ans = max1s(edge, i, j, visited);
                    if(ans>max){
                        max = ans;
                    }
                }
            }
        }
        return max;
    }

    private static int max1s(String[] edge, int x, int y, boolean[][] visited) {
        visited[x][y] = true;
        int max = 0;
        int[] x_direction = {1, 0, 0, -1};
        int[] y_direction = {0, 1, -1, 0};

        for(int i=0;i<x_direction.length;i++){
            int a = x_direction[i] + x;
            int b = y_direction[i] + y;

            if(a>=0 && b>=0 && a< edge.length&& b<edge[a].length() && edge[a].charAt(b)=='1' && !visited[a][b]){
                int ans = max1s(edge, a, b, visited);
                max = max+ans;
            }
        }
        return max+1;
    }


}
