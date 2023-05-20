package BinaryTree.BinarySearchTree;

import BinaryTree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Arrays;

public class Pair_sum {
    public static void preOrderTraversal(BinaryTreeNode<Integer> root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        preOrderTraversal(root.left, list);
        preOrderTraversal(root.right, list);
    }

    public static int[] convertToArray(BinaryTreeNode<Integer> root){
        ArrayList<Integer> list = new ArrayList<>();
        preOrderTraversal(root, list);
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }

        Arrays.sort(result);
        return result;


    }
    static void pairSum(BinaryTreeNode<Integer> root, int sum) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int[] arr = convertToArray(root);
        int i=0;
        int j= arr.length-1;

        while(j>i){
            if (arr[i] + arr[j] < sum){
                i++;
            }
            else if (arr[i] + arr[j] > sum){
                j--;
            }
            else{
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }
        }
    }
}
