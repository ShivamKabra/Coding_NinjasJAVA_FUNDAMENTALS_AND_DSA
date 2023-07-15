package Test3;

import Trees.TreeNode;

public class RemoveLeafNodes {
    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(root==null){
            return null;
        }
        if(root.children.size()==0){
            return null;
        }

        for(int i=0; i<root.children.size(); i++){
            TreeNode<Integer> child = root.children.get(i);

            if(child.children.size()==0){
                for(int j=i;j<root.children.size()-1;j++){
                    root.children.set(j, root.children.get(j+1));
                }

                root.children.remove(root.children.size()-1);
                i--;
            }
        }

        for(int i=0;i<root.children.size(); i++){
            root.children.set(i, removeLeafNodes(root.children.get(i)));
        }

        return root;

    }
}
