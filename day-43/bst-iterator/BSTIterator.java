import java.util.*;

public class BSTIterator {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Iterator {

        Stack<TreeNode> stack = new Stack<>();

        Iterator(TreeNode root) {
            pushLeft(root);
        }

        void pushLeft(TreeNode node) {

            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        int next() {

            TreeNode node = stack.pop();

            if (node.right != null)
                pushLeft(node.right);

            return node.val;
        }

        boolean hasNext() {
            return !stack.isEmpty();
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(7);

        root.left = new TreeNode(3);

        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        Iterator iterator = new Iterator(root);

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}