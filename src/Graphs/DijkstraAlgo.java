package Graphs;

import java.util.Scanner;

public class DijkstraAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); // Number of vertices
        int e = sc.nextInt(); // Number of edges
        int[][] adjacencyMatrix = new int[v][v]; // Adjacency matrix to store the edge weights

        // Inputting the edges and their weights
        for (int i = 0; i < v; i++) {
            int v1 = sc.nextInt(); // Vertex 1
            int v2 = sc.nextInt(); // Vertex 2
            int weight = sc.nextInt(); // Weight of the edge
            adjacencyMatrix[v1][v2] = weight; // Setting the weight for the edge between v1 and v2
            adjacencyMatrix[v2][v1] = weight; // Setting the weight for the edge between v2 and v1
        }

        dijkstra(adjacencyMatrix); // Calling the Dijkstra's algorithm function
    }

    private static void dijkstra(int[][] adjacencyMatrix) {
        boolean[] visited = new boolean[adjacencyMatrix.length]; // Array to keep track of visited vertices
        int[] distance = new int[adjacencyMatrix.length]; // Array to store the distances from the source vertex
        distance[0] = 0; // Distance of the source vertex is 0

        for (int i = 1; i < adjacencyMatrix.length; i++) {
            distance[i] = Integer.MAX_VALUE; // Set initial distances of all other vertices to infinity
        }

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            int minVertex = findMinVertex(distance, visited); // Find the vertex with minimum distance among the unvisited vertices
            visited[minVertex] = true; // Mark the vertex as visited

            for (int j = 0; j < adjacencyMatrix.length; j++) {
                if (adjacencyMatrix[minVertex][j] != 0 && !visited[j]) {
                    int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j]; // Calculate the new distance

                    // If the new distance is smaller than the current distance, update the distance
                    if (newDist < distance[j]) {
                        distance[j] = newDist;
                    }
                }
            }
        }

        // Printing the distances from the source vertex to each vertex
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " " + distance[i]);
        }
    }

    private static int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i; // Update the minimum vertex index if a smaller distance is found
            }
        }
        return minVertex;
    }
}
