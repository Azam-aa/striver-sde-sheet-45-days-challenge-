import java.util.*;

public class PostorderTraversal {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<Integer> postorderTraversal(TreeNode root) {

        LinkedList<Integer> ans =
                new LinkedList<>();

        if (root == null)
            return ans;

        Stack<TreeNode> stack =
                new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();

            ans.addFirst(node.val);

            if (node.left != null)
                stack.push(node.left);

            if (node.right != null)
                stack.push(node.right);
        }

        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(
                postorderTraversal(root)
        );
    }
}