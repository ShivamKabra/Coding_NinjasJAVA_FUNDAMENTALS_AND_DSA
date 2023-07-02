package Graphs;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.*;
import java.util.Queue;

public class getPathBFS {
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
        ArrayList<Integer> ans= getPathBFSmethod(edges,visited,V1,V2);
        if(ans!=null){
            for(int elem:ans)
            {
                System.out.print(elem+" ");
            }
        }
    }

    private static ArrayList<Integer> getPathBFSmethod(int[][] edges, boolean[] visited, int v1, int v2) {
        if(v1==v2){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(v1);
            visited[v1]= true;
            return arr;
        }
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(v1);
        visited[v1] = true;

        while(!q.isEmpty()){
            int front = q.remove();

            for(int i=0;i<edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    q.add(i);
                    map.put(i, front);
                    visited[i] = true;
                    if(i==v2){
                        ans.add(i);
                        while(!ans.contains(v1)){
                            int b= map.get(i);
                            ans.add(b);
                            i=b;
                        }
                        return ans;
                    }

                }
            }

        }
        return null;
    }
}
