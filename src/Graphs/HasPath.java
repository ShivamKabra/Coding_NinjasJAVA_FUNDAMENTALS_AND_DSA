package Graphs;

import java.util.Scanner;

public class HasPath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt(); // Number of vertices
        int E = s.nextInt(); // Number of edges

        // Create adjacency matrix
        int[][] edges = new int[V+1][V+1]; // Adjust the dimensions

        // Read input for edges and update adjacency matrix
        for (int i = 0; i < E; i++) {
            int sv = s.nextInt(); // Starting vertex of an edge
            int ev = s.nextInt(); // Ending vertex of an edge

            edges[sv][ev] = 1; // Update adjacency matrix to indicate the presence of an edge
            edges[ev][sv] = 1; // Since the graph is undirected, update the opposite direction as well
        }

        int start = s.nextInt(); // Starting vertex for path
        int end = s.nextInt(); // Ending vertex for path

        boolean[] visited = new boolean[V+1]; // Create an array to track visited vertices

        // Call the hasPath function to check if a path exists between the start and end vertices
        System.out.println(hasPath(edges, start, end, visited));
    }

    public static boolean hasPath(int[][] edges, int start, int end, boolean[] visited) {
        // If there is a direct edge between the start and end vertices, return true
        if (edges[start][end] == 1) {
            return true;
        }

        visited[start] = true; // Mark the current vertex as visited

        // Check all adjacent vertices of the current vertex
        for (int i = 0; i < edges.length; i++) {
            // If there is an edge between the current vertex and an unvisited adjacent vertex
            if (i != start && edges[start][i] == 1 && !visited[i]) {
                // Recursively check if a path exists between the adjacent vertex and the end vertex
                if (hasPath(edges, i, end, visited)) {
                    return true; // If a path is found, return true
                }
            }
        }

        return false; // If no path is found, return false
    }


}
