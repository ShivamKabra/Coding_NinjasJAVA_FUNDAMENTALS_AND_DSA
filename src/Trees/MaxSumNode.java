package Trees;

public class MaxSumNode {
    public static int sum(TreeNode<Integer> root){
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
        }

        return sum;
    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here

        int sumRoot = sum(root);
        int maxSum = Integer.MIN_VALUE;
        TreeNode<Integer> node = null;

        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> maxNode1=maxSumNode(root.children.get(i));

            int sum=sum(maxNode1);
            if(sum>maxSum){
                maxSum=sum;
                node=maxNode1;
            }
        }

        if(sumRoot>maxSum){
            return root;
        }
        return node;
    }

}
