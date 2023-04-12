package Trees;

public class Leaf_nodes {
    public static int countLeafNodes(TreeNode<Integer> root){

        // Write your code here
        if(root == null){
            return 0;
        }
        if(root.children.isEmpty()){
            return 1;
        }

        int count=0;

        for(int i=0;i<root.children.size();i++){
            count=count+countLeafNodes(root.children.get(i));
        }

        return count;

    }

}
