package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class find_second_largest {

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

        if(root.children.size() == 0){
            return null;
        }
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        TreeNode<Integer> fl=root,sl=null;
        int data = 0;
        queue.add(root);
        //queue.add(null);

        while(!queue.isEmpty())
        {
            TreeNode<Integer> frontNode = queue.poll();
//             if(frontNode == null){
//                 if(queue.isEmpty()){
//                     break;
//                 }

//                 queue.add(null);
//             }
//             else{
            for(int i=0;i<frontNode.children.size();i++){
                queue.add(frontNode.children.get(i));
            }

            if(frontNode.data >  data){
                if(frontNode.data > fl.data){
                    sl = fl;
                    data = fl.data;
                    fl = frontNode;
                }
                else if (frontNode.data < fl.data){
                    sl = frontNode;
                    data = sl.data;
                }
            }
            // if(fl.data<frontNode.data)
            // {
            //     sl=fl;
            //  fl=frontNode;
            // }
            // else if(sl.data<frontNode.data){
            //     sl=frontNode;
            // }


        }


        return sl;


    }
}
