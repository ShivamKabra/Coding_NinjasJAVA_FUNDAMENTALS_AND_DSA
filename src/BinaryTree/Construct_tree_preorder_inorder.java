package BinaryTree;

public class Construct_tree_preorder_inorder {
    public static BinaryTreeNode<Integer> buildTreeHelper(int[] pre, int[] in, int ins, int ine, int pres, int pree ){
        if(ins>ine){
            return null;
        }

        int rootData = pre[pres];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex=-1;
        for(int i=0; i<=ine; i++){
            if(in[i]==rootData){
                rootIndex=i;
            }
        }
        if(rootIndex==-1){
            return null;
        }

        int left_ins = ins;
        int left_ine = rootIndex-1;
        int left_pres = pres+1;
        int left_pree = left_ine-left_ins + left_pres;
        int right_ins = rootIndex+1;
        int right_ine = ine;
        int right_pres = left_pree+1;
        int right_pree = pree;

        root.left = buildTreeHelper(pre, in, left_ins, left_ine, left_pres, left_pree);
        root.right = buildTreeHelper(pre, in, right_ins, right_ine, right_pres, right_pree);


        return root;

    }

        public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        //Your code goes here
        return buildTreeHelper( preOrder, inOrder, 0, inOrder.length-1, 0, preOrder.length-1);

    }
}
