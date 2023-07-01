package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class getPath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][]=new int[V][V];
        for(int i=0;i<E;i++){
            int sv=s.nextInt();
            int ev=s.nextInt();
            edges[sv][ev]=1;
            edges[ev][sv]=1;
        }
        int V1=s.nextInt();
        int V2=s.nextInt();
        boolean visited[]=new boolean[V];
        ArrayList<Integer> ans = getPathHelper(edges, V1, V2, visited);
        if(!(ans==null)){
            for(int elements : ans){
                System.out.print(elements+" ");
            }
        }
    }

    private static ArrayList<Integer> getPathHelper(int[][] edges, int v1, int v2, boolean[] visited) {
        if(v1==v2){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(v1);
            visited[v1] = true;
            return arr;
        }

        visited[v1] = true;
        for(int i=0;i<edges.length;i++){
            if(edges[v1][i]==1 && !visited[i]){
                ArrayList<Integer> ans = getPathHelper(edges, i, v2, visited);
                if(!(ans==null)){
                    ans.add(v1);
                    return ans;
                }
            }
        }
        return null;
    }
}
