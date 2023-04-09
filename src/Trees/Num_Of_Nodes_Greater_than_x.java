package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Num_Of_Nodes_Greater_than_x {
    public static int numNodeGreater(TreeNode<Integer> root,int x){

        // Write your code here
        if(root == null){
            return 0;
        }

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        int ans=0;

        while(!queue.isEmpty()){
            TreeNode<Integer> frontNode = queue.remove();
            if(frontNode==null){
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                if(frontNode.data>x){
                    ans++;
                }
                for(int i=0;i<frontNode.children.size();i++){
                    queue.add(frontNode.children.get(i));
                }
            }
        }

        return ans;

    }
}
