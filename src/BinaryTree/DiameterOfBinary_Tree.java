package BinaryTree;

public class DiameterOfBinary_Tree {
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh)+1;
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        if(root==null){
            return 0;
        }

        int op1 = height(root.left) + height(root.right);
        int op2 = diameterOfBinaryTree(root.left);
        int op3 = diameterOfBinaryTree(root.right);

        return Math.max(op1, Math.max(op2, op3))+1;
    }
}
