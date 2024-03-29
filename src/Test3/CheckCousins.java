package Test3;

import BinaryTree.BinaryTreeNode;

public class CheckCousins {
    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        // Write your code here
        return !isSiblings(root,p,q) && level(root, 0, p) == level(root, 0, q);

    }

    private static boolean isSiblings(BinaryTreeNode<Integer> root, int p, int q) {
        if(root==null){
            return false;
        }

        if(root.left!=null && root.right!=null){
            if(root.left.data==p && root.right.data==q){
                return true;
            }
        }

        return isSiblings(root.left, p, q) || isSiblings(root.right, p, q);
    }

    private static int level(BinaryTreeNode<Integer> root, int k, int p) {
        if(root==null){
            return -1;
        }
        if(root.data==p){
            return k;
        }

        int left = level(root.left, k+1, p);
        int right = level(root.right, k+1, p);

        if(left==-1){
            return right;
        }
        if(right==-1){
            return left;
        }

        return -1;
    }
}
