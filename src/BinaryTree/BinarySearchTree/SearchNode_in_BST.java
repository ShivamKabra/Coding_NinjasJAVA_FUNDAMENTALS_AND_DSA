package BinaryTree.BinarySearchTree;

import BinaryTree.BinaryTreeNode;

public class SearchNode_in_BST {
    static boolean left_ans;
    static boolean right_ans;
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return false;
        }

        if(root.data == k){
            return true;
        }

        if(root.data>k){
            left_ans = searchInBST(root.left, k);
        }

        if(root.data<k){
            right_ans = searchInBST(root.right, k);
        }

        return left_ans || right_ans;
    }
}
