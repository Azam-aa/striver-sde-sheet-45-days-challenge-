import java.util.*;

public class InorderPostorder {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static Map<Integer, Integer> inorderMap = new HashMap<>();
    static int postIndex;

    static TreeNode buildTree(int[] inorder, int[] postorder) {

        inorderMap.clear();

        for (int i = 0; i < inorder.length; i++)
            inorderMap.put(inorder[i], i);

        postIndex = postorder.length - 1;

        return build(postorder, 0, inorder.length - 1);
    }

    static TreeNode build(int[] postorder, int left, int right) {

        if (left > right)
            return null;

        int rootVal = postorder[postIndex--];

        TreeNode root = new TreeNode(rootVal);

        int index = inorderMap.get(rootVal);

        root.right = build(postorder, index + 1, right);
        root.left = build(postorder, left, index - 1);

        return root;
    }

    static void preorder(TreeNode root) {

        if (root == null)
            return;

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = buildTree(inorder, postorder);

        preorder(root);
    }
}