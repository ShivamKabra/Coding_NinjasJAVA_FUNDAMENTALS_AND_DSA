package Graphs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int source;
    int dest;
    int weight;

    // Implementing Comparable interface to compare edges based on weight
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}

public class Kruskal_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of vertices
        int e = sc.nextInt(); // Number of edges

        Edge[] input = new Edge[e]; // Array to store the input edges

        // Inputting the edges and their weights
        for (int i = 0; i < e; i++) {
            Edge edge = new Edge();
            edge.source = sc.nextInt(); // Source vertex of the edge
            edge.dest = sc.nextInt(); // Destination vertex of the edge
            edge.weight = sc.nextInt(); // Weight of the edge
            input[i] = edge; // Adding the edge to the input array
        }

        kruskals(input, n); // Calling the Kruskal's algorithm function
    }

    private static void kruskals(Edge[] input, int n) {
        Arrays.sort(input); // Sorting the edges based on weight
        Edge[] output = new Edge[n - 1]; // Array to store the output edges (minimum spanning tree)
        int[] parent = new int[n]; // Array to store the parent of each vertex
        for (int i = 0; i < n; i++) {
            parent[i] = i; // Initializing the parent array (each vertex is its own parent initially)
        }

        int count = 0; // Counter to keep track of the number of edges in the output
        int a = 0; // Index for iterating through the sorted input edges

        while (count <= n - 1) {
            Edge currentEdge = input[a]; // Get the current edge
            int parentSource = findParent(currentEdge.source, parent); // Find the parent of the source vertex
            int parentDest = findParent(currentEdge.dest, parent); // Find the parent of the destination vertex

            if (parentSource != parentDest) {
                output[count] = currentEdge; // Add the current edge to the output
                count++;
                parent[parentDest] = parentSource; // Set the parent of the destination vertex to the source vertex
            }

            a++;
        }

        // Printing the minimum spanning tree
        for (Edge edge : output) {
            if (edge.source < edge.dest) {
                System.out.println(edge.source + " " + edge.dest + " " + edge.weight);
            } else {
                System.out.println(edge.dest + " " + edge.source + " " + edge.weight);
            }
        }
    }

    private static int findParent(int v, int[] parent) {
        if (parent[v] == v) {
            return v; // If the vertex is its own parent, return the vertex
        }

        return findParent(parent[v], parent); // Recursively find the parent
    }
}




//
//import java.util.Scanner;
//        import java.util.Arrays;
//class Edge implements Comparable<Edge>{
//    int source;
//    int destination;
//    int weight;
//    public int compareTo(Edge o){
//        return this.weight-o.weight;
//    }
//}
//public class Solution {
//    public static void kruskals(Edge input[],int V){
//        Arrays.sort(input);
//        int count=0;
//        int k=0;
//        Edge output[]=new Edge[V-1];
//        int parent[]=new int[V];
//        for(int j=0;j<V;j++){
//            parent[j]=j;
//        }
//        while(count!=V-1){
//            Edge currentEdge=input[k];
//            int sourceparent=parentcall(parent,currentEdge.source);
//            int destinationparent=parentcall(parent,currentEdge.destination);
//            if(sourceparent!=destinationparent)
//            {
//                output[count]=currentEdge;
//                count++;
//                parent[sourceparent]=destinationparent;
//            }
//            k++;
//        }
//        for(int i=0;i<V-1;i++){
//            if(output[i].source<=output[i].destination)
//                System.out.println(output[i].source+" "+output[i].destination+" "+output[i].weight);
//            else
//                System.out.println(output[i].destination+" "+output[i].source+" "+output[i].weight);
//        }
//    }
//    public static int parentcall(int[] parent,int vertex){
//        if(vertex==parent[vertex])
//            return  vertex;
//        return parentcall(parent,parent[vertex]);
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int V = s.nextInt();
//        int E = s.nextInt();
//        Edge input[]=new Edge[E];
//        for(int i=0;i<input.length;i++){
//            input[i]= new Edge();
//            input[i].source=s.nextInt();
//            input[i].destination=s.nextInt();
//            input[i].weight=s.nextInt();
//        }
//        kruskals(input,V);
//    }
//}