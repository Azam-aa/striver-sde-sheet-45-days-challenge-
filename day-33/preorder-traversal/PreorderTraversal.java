import java.util.*;

public class PreorderTraversal {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();

            ans.add(node.val);

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
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
                preorderTraversal(root)
        );
    }
}