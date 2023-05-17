package BinaryTree.BinarySearchTree;

import BinaryTree.BinaryTreeNode;

public class LCA_BinaryTree {
    static BinaryTreeNode<Integer> getLCA_helper(BinaryTreeNode<Integer> root, int a, int b){
        if(root==null){
            return null;
        }
        if(root.data == a || root.data==b){
            return root;
        }
        BinaryTreeNode<Integer> leftLCA = getLCA_helper(root.left, a, b);
        BinaryTreeNode<Integer> rightLCA = getLCA_helper(root.right, a, b);

        if (leftLCA != null && rightLCA != null) {
            return root;
        } else if (leftLCA != null) {
            return leftLCA;
        } else if (rightLCA != null) { // Add this condition
            return rightLCA;
        } else {
            return null;
        }
    }

    static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        BinaryTreeNode<Integer> ans =  getLCA_helper(root, a, b);

        if(ans!=null){
            return ans.data;
        }else{
            return -1;
        }
    }
}
