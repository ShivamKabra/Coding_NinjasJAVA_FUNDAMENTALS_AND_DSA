package Trees;

public class Next_largest_element {
    static TreeNode<Integer> res =null;
    static void nextLargerElementUtil(TreeNode<Integer> root, int x)
    {
        if (root == null)
        {
            return;
        }

        // if root is less than res but
        // greater than x, update res
        if (root.data > x)
        {
            if (res==null || root.data<res.data)
            {
                res = root;
            }
        }

        // Number of children of root
        int numChildren = root.children.size();

        // Recur calling for every child
        for (int i = 0; i < numChildren; i++)
        {
            nextLargerElementUtil(root.children.get(i),x);
        }


    }


    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

        // resultant node
        //TreeNode<Integer> res = new TreeNode<>(Integer.MIN_VALUE);
        // calling helper function
        nextLargerElementUtil(root,n);
        //System.out.println(res);

        return res;



    }
}
