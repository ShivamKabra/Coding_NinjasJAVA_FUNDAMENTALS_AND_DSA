package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Islands {
    public static int numConnected(int[][] edges, int n){
        ArrayList<ArrayList<Integer>> arrayList = connectedComponents(edges);
        int c = 0;
        for(ArrayList<Integer> row : arrayList){
            c++;
        }
        return c;
    }

    private static ArrayList<ArrayList<Integer>> connectedComponents(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for(int i=0;i< visited.length;i++){
            if(!visited[i]){
                arrayList.add(getPathMethod(edges,i,  visited));
            }
        }

        return arrayList;
    }

    private static ArrayList<Integer> getPathMethod(int[][] edges, int v, boolean[] visited) {
        visited[v] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        ArrayList<Integer> arr = new ArrayList<>();

        while (!queue.isEmpty()){
            int front = queue.remove();
            arr.add(front);
            for(int i= 0; i<edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return arr;
    }


}
