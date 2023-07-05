package Graphs;

import java.util.Scanner;

public class isConnected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] edges = new int[n][n];

        for(int i=0;i<e;i++){
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        //boolean[] visited = new boolean[edges.length];
        boolean ans = isConnected_method(edges);
        System.out.println(ans);
    }

    private static boolean isConnected_method(int[][] edges) {
        if(edges.length==0){
            return true;
        }
        boolean[] visited = new boolean[edges.length];
        DFS(edges, 0, visited);
        for(boolean elements : visited){
            if(elements==false){
                return false;
            }
        }
        return true;
    }

    private static void DFS(int[][] edges, int i, boolean[] visited) {
        visited[i] = true;
        for(int j=0;j<edges.length;j++){
            if(edges[i][j]==1 && !visited[j]){
                DFS(edges, j, visited);
            }
        }
        return;
    }
}
