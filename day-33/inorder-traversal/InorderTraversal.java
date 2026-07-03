import java.util.*;

public class InorderTraversal {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<Integer> inorder(TreeNode root) {

        List<Integer> ans =
                new ArrayList<>();

        Stack<TreeNode> stack =
                new Stack<>();

        TreeNode curr = root;

        while (curr != null ||
               !stack.isEmpty()) {

            while (curr != null) {

                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            ans.add(curr.val);

            curr = curr.right;
        }

        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(
                inorder(root)
        );
    }
}