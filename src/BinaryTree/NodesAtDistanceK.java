package BinaryTree;

import java.util.ArrayList;

public class NodesAtDistanceK {
    static ArrayList<BinaryTreeNode<Integer>> path;

    public static boolean findPath(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return false;
        }
        if(root.data==k){
            path.add(root);
            return true;
        }
        if(findPath(root.left, k) ||  findPath(root.right, k)){
            path.add(root);
            return true;
        }

        return false;

    }

    public static void printAtDistanceK(BinaryTreeNode<Integer> root, int k, BinaryTreeNode<Integer> blocker){
        if(root == null  ||k<0|| root == blocker){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        printAtDistanceK(root.left, k-1, blocker);
        printAtDistanceK(root.right, k-1, blocker);
    }
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        //Your code goes here
        path = new ArrayList<BinaryTreeNode<Integer>>();
        findPath(root, node);

        for(int i = 0; i<path.size(); i++){
            printAtDistanceK(path.get(i), k-i, i==0 ? null : path.get(i-1));
        }
    }
}
