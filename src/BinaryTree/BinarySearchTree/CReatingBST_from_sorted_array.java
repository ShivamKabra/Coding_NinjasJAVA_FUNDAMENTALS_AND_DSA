package BinaryTree.BinarySearchTree;

import BinaryTree.BinaryTreeNode;

public class CReatingBST_from_sorted_array {
    public static BinaryTreeNode<Integer> helper(int[] arr, int si, int ei){
        if(si > ei){
            return null;
        }

        int mid = (si+ei)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = helper(arr, si, mid-1);
        root.right = helper(arr, mid+1, ei);


        return root;
    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return helper( arr,  0 , n-1);
    }
}
