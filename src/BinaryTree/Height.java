package BinaryTree;

public class Height {
    public static int height(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root==null){
            return 0;
        }

        int leftHeight= height(root.left);
        int rightHeight= height(root.right);

        int ans = Math.max(leftHeight, rightHeight)+1;
        return ans;
    }
}
