package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
public class PrintLevelWise {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                BinaryTreeNode<Integer> front = queue.remove();
                System.out.print(front.data+" ");
                if(front.left!=null){
                    queue.add(front.left);
                }

                if(front.right!=null){
                    queue.add(front.right);
                }
            }
            System.out.println();

        }
    }
}
