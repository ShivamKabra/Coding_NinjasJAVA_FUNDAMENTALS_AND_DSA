package BinaryTree;

public class RootToLEafPathSum {
    public  static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String s){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            if(root.data == k){
                s=s+root.data+" ";
                System.out.println(s);
            }
            //s="";
            return;
        }

        s=s+root.data+" ";
        rootToLeafPathsSumToK(root.left, k-root.data, s);
        rootToLeafPathsSumToK(root.right, k-root.data, s);
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        //Your code goes here
        rootToLeafPathsSumToK(root, k , "");
    }
}
