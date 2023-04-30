package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
public class CountNodesLargerThanX {
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root==null){
            return -1;
        }
        int count=0;
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> front = queue.remove();
            if(front.data>x){
                count++;
            }
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }

        return count;
    }
}
