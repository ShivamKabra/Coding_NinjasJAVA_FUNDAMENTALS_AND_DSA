package Graphs;
import java.util.*;
import java.util.Queue;

public class AllConnectedComponents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // total number of edges e
        int e = s.nextInt();
        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        ArrayList<ArrayList<Integer>> arrayList = connectedComponents(edges);
        for(ArrayList<Integer> row : arrayList){
            for(int a : row){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> connectedComponents(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                arrayList.add(getPathMethod(edges, i, visited));
            }
        }
        return arrayList;
    }

    private static ArrayList<Integer> getPathMethod(int[][] edges, int sv, boolean[] visited) {
        visited[sv] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        ArrayList<Integer> arr = new ArrayList<>();

        while(!q.isEmpty()){
            int front = q.remove();

            arr.add(front);
            for(int i=0;i<edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
