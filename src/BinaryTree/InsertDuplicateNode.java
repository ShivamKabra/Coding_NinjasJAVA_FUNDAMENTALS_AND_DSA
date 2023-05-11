package BinaryTree;

public class InsertDuplicateNode {
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> save = root.left;
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        root.left = newNode;
        newNode.left= save;

        insertDuplicateNode(newNode.left);
        insertDuplicateNode(root.right);
    }
}
