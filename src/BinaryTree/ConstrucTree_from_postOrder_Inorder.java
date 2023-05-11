package BinaryTree;

public class ConstrucTree_from_postOrder_Inorder {
    public static BinaryTreeNode<Integer> buildTreeHelper(int[] po, int[] in, int ins, int ine, int pos, int poe){
        if(ins>ine){
            return null;
        }

        int rootData = po[poe];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex= -1;
        for(int i=0;i<=ine ;i++){
            if(in[i]== rootData){
                rootIndex=i;
                break;
            }
        }
        if(rootIndex==-1){
            return null;
        }

        int left_ins = ins;
        int left_ine = rootIndex-1;
        int right_ins = rootIndex+1;
        int right_ine = ine;
        int left_pos = pos;
        int left_poe = left_ine-left_ins + left_pos;
        int right_pos = left_poe+1;
        int right_poe = poe-1;

        root.left = buildTreeHelper(po, in, left_ins, left_ine, left_pos, left_poe);
        root.right = buildTreeHelper(po, in, right_ins, right_ine, right_pos, right_poe);

        return root;

    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        //Your code goes here
        return buildTreeHelper(postOrder, inOrder, 0, inOrder.length-1, 0, postOrder.length-1);
    }
}
