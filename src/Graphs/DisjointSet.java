package Graphs;

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

// Class to represent the Disjoint Set data structure
class DisjointSet {
    // Lists to store the rank, parent, and size of each element
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    // Constructor to initialize the disjoint set
    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0); // Initialize the rank of each element to 0
            parent.add(i); // Initialize the parent of each element to itself (initially, each element is its own parent)
            size.add(1); // Initialize the size of each set to 1 (each element is a separate set initially)
        }
    }

    // Find the representative (ultimate parent) of a set
    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node; // If the current element is its own parent, it is the representative of the set
        }
        // Path compression: Update the parent of the current element to the ultimate parent of the set
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp); // Update the parent to the ultimate parent to optimize future find operations
        return parent.get(node);
    }

    // Union two sets by rank (using rank to optimize the tree height)
    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u); // Find the ultimate parent of the set containing u
        int ulp_v = findUPar(v); // Find the ultimate parent of the set containing v
        if (ulp_u == ulp_v)
            return; // If the ultimate parents are the same, u and v are already in the same set
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v); // Attach the set with lower rank to the set with higher rank
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u); // Attach the set with lower rank to the set with higher rank
        } else {
            parent.set(ulp_v, ulp_u); // Attach the set with lower rank to the set with higher rank
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1); // Increment the rank of the ultimate parent if both sets have the same rank
        }
    }

    // Union two sets by size (using size to optimize the merging)
    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u); // Find the ultimate parent of the set containing u
        int ulp_v = findUPar(v); // Find the ultimate parent of the set containing v
        if (ulp_u == ulp_v)
            return; // If the ultimate parents are the same, u and v are already in the same set
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v); // Attach the smaller set to the larger set
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u)); // Update the size of the larger set
        } else {
            parent.set(ulp_v, ulp_u); // Attach the smaller set to the larger set
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v)); // Update the size of the larger set
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create a DisjointSet object with 7 elements
        DisjointSet ds = new DisjointSet(7);

        // Perform union operations
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        // Check if elements 3 and 7 belong to the same set or not
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same"); // The elements belong to the same set
        } else {
            System.out.println("Not Same");
        }

        // Perform another union operation
        ds.unionByRank(3, 7);

        // Check if elements 3 and 7 belong to the same set or not after the union
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same"); // The elements belong to the same set
        } else {
            System.out.println("Not Same");
        }
    }
}

