package BinaryTree.BinarySearchTree;
// difficulty in understanding
import BinaryTree.BinaryTreeNode;

public class ReplaceWithLargerSum {


        public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
            // Call the helper function to replace the nodes' data with the sum
            replaceWithSumHelper(root, 0);
        }

        // Helper function to replace the nodes' data with the sum
        private static int replaceWithSumHelper(BinaryTreeNode<Integer> root, int sum) {
            // Base case: if the node is null, return the sum
            if (root == null) {
                return sum;
            }

            // Calculate the sum of all nodes greater than the current node
            sum = replaceWithSumHelper(root.right, sum);

            // Update the current node's data with the sum
            sum += root.data;
            root.data = sum;

            // Recursively calculate the sum of all nodes greater than the current node in the left subtree
            sum = replaceWithSumHelper(root.left, sum);

            return sum;
        }
    }


