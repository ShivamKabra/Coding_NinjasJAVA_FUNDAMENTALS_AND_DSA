package Trees;

public class ContainsX {

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

        // Write your code here

        if(root.data==x){
            return true;
        }
        for(int i=0;i<root.children.size();i++){
            boolean ans = checkIfContainsX(root.children.get(i), x);
            if(ans){
                return true;
            }
        }


        return false;

    }

}
