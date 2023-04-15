package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Replace_node_with_depth {
    public static void replaceWithDepthValue(TreeNode<Integer> root){

        // Write your code here

        int a=0;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);


        //System.out.println(0);

        while(!queue.isEmpty()){
            TreeNode<Integer> frontNode=queue.remove();

            if(frontNode==null){
                if(queue.isEmpty()){
                    break;
                }

                a++;
                queue.add(null);
            }
            else{
                frontNode.data=a;

                for(int i=0;i<frontNode.children.size();i++){
                    queue.add(frontNode.children.get(i));
                }
            }

        }

    }
}
