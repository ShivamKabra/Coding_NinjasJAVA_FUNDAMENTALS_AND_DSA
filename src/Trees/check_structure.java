package Trees;

public class check_structure {
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

        if(root1== null && root2==null){
            return true;
        }

        if(root1==null || root2==null){
            return false;
        }

        if(root1.data!=root2.data){
            return false;
        }
        if(root1.children.size()!=root2.children.size()){
            return false;
        }

        for(int i=0;i<root1.children.size();i++){
            boolean ans = checkIdentical(root1.children.get(i), root2.children.get(i));

            if(!ans){
                return false;
            }
        }

        return true;
        // Write your code here
    }
}
