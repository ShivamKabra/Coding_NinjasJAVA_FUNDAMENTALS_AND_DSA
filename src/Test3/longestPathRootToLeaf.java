package Test3;

import BinaryTree.BinaryTreeNode;

import java.util.ArrayList;

public class longestPathRootToLeaf {
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root) {
        // Write your code here
        if (root == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> leftArrayList = longestRootToLeafPath(root.left);
        ArrayList<Integer> rightArrayList = longestRootToLeafPath(root.right);

        if (leftArrayList.size() >= rightArrayList.size()) {
            leftArrayList.add(root.data);
            return leftArrayList;
        } else {
            rightArrayList.add(root.data);
            return rightArrayList;
        }
    }
}
