package BinaryTree;



public class Min_max_using_pairClass {
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root==null){
            return null;
        }

        int min= root.data;
        int max= root.data;

        Pair<Integer, Integer> leftPair = getMinAndMax(root.left);
        Pair<Integer, Integer> rightPair = getMinAndMax(root.right);


        if(leftPair!=null){
            min = Math.min(min, leftPair.minimum);
            max = Math.max(max, leftPair.maximum);
        }

        if(rightPair!=null){
            min = Math.min(min, rightPair.minimum);
            max = Math.max(max, rightPair.maximum);
        }


        return new Pair<>(min, max);
    }
}
