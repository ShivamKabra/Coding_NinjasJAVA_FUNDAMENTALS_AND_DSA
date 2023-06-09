package BinaryTree.BinarySearchTree;

import BinaryTree.BinaryTreeNode;

public class LargestBST {
    public static boolean isBST(BinaryTreeNode<Integer> root, Integer min, Integer max){
        if(root==null){
            return true;
        }

        if((min!=null && min>=root.data) || (max!=null && max<=root.data) ){
            return false;
        }

        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh)+1;
    }
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        // Write your code here
        if(isBST(root, null, null)){
            return height(root);
        }

        else{
            int left = largestBSTSubtree(root.left);
            int right = largestBSTSubtree(root.right);

            return Math.max(left, right);
        }

    }
}
