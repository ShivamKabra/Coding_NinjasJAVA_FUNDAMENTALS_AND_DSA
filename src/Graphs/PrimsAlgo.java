package Graphs;

import java.util.Scanner;

public class PrimsAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); // Number of vertices
        int e = sc.nextInt(); // Number of edges
        int[][] adjacencyMatrix = new int[v][v]; // Adjacency matrix to store the edge weights

        // Inputting the edges and their weights
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt(); // Vertex 1
            int v2 = sc.nextInt(); // Vertex 2
            int weight = sc.nextInt(); // Weight of the edge
            adjacencyMatrix[v1][v2] = weight; // Setting the weight for the edge between v1 and v2
            adjacencyMatrix[v2][v1] = weight; // Setting the weight for the edge between v2 and v1
        }

        prims(adjacencyMatrix); // Calling the Prims algorithm function
    }

    private static void prims(int[][] adjacencyMatrix) {
        boolean[] visited = new boolean[adjacencyMatrix.length]; // Array to keep track of visited vertices
        int[] weight = new int[adjacencyMatrix.length]; // Array to store the weights of vertices
        int[] parent = new int[adjacencyMatrix.length]; // Array to store the parent of each vertex in the minimum spanning tree
        weight[0] = 0; // Weight of the starting vertex is 0
        parent[0] = -1; // Starting vertex has no parent
        for (int i = 1; i < weight.length; i++) {
            weight[i] = Integer.MAX_VALUE; // Set initial weights of all other vertices to infinity
        }

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            // Find the vertex with minimum weight among the unvisited vertices
            int minVertex = findMinVertex(weight, visited);
            visited[minVertex] = true; // Mark the vertex as visited
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                // Check the neighboring vertices of the minimum weight vertex
                if (adjacencyMatrix[minVertex][j] != 0 && !visited[j]) {
                    // If the weight of the edge is less than the current weight of the neighboring vertex,
                    // update its weight and set the minimum weight vertex as its parent
                    if (adjacencyMatrix[minVertex][j] < weight[j]) {
                        parent[j] = minVertex;
                        weight[j] = adjacencyMatrix[minVertex][j];
                    }
                }
            }
        }

        // Printing the minimum spanning tree
        for (int i = 1; i < parent.length; i++) {
            if (parent[i] < i) {
                System.out.println(parent[i] + " " + i + " " + weight[i]);
            } else {
                System.out.println(i + " " + parent[i] + " " + weight[i]);
            }
        }
    }

    private static int findMinVertex(int[] weight, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < weight.length; i++) {
            if (!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
                minVertex = i; // Update the minimum vertex index if a smaller weight is found
            }
        }
        return minVertex;
    }
}
