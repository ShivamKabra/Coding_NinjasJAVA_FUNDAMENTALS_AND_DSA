package BinaryTree;

public class NodesWithoutSiblings {
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root==null){
            return;
        }
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data+" ");

        }
        if(root.right==null && root.left!=null){
            System.out.println(root.left.data);
        }

        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
}
