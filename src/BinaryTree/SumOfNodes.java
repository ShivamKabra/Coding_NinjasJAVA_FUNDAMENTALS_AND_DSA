package BinaryTree;

public class SumOfNodes {
    public static int getSum(BinaryTreeNode<Integer> root) {
        //Your code goes here.
        if(root==null){
            return 0;
        }
        int sum=root.data;
        sum+=getSum(root.left);
        sum=sum+getSum(root.right);

        return sum;
    }
}
