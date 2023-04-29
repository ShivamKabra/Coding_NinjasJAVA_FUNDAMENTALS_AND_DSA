package BinaryTree;
import java.util.Queue;
import java.util.LinkedList;

public class PrintRowWIse {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> node = queue.remove();
            System.out.print(node.data + ":");
            if (node.left != null) {
                System.out.print("L:" + node.left.data);
                queue.add(node.left);
            } else {
                System.out.print("L:-1");
            }
            if (node.right != null) {
                System.out.print(",R:" + node.right.data);
                queue.add(node.right);
            } else {
                System.out.print(",R:-1");
            }
            System.out.println();
        }
    }
}
