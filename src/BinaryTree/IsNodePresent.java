package BinaryTree;

public class IsNodePresent {
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        boolean ans_left=isNodePresent(root.left, x);
        boolean ans_right=isNodePresent(root.right, x);

        return ans_left || ans_right;
    }
}
