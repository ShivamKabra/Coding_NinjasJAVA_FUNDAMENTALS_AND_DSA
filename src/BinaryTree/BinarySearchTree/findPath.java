package BinaryTree.BinarySearchTree;

import BinaryTree.BinaryTreeNode;

import java.util.ArrayList;

public class findPath {
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(root==null){
            return null;
        }
        if(root.data == data){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            return list;

        }

        ArrayList<Integer> left_ans = getPath(root.left, data);
        if(left_ans!=null){
            left_ans.add(root.data);
            return left_ans;
        }

        ArrayList<Integer> right_ans = getPath(root.right, data);
        if(right_ans!=null){
            right_ans.add(root.data);
            return right_ans;
        }else{
            return null;
        }
    }
}
