import java.util.*;

public class PreorderInorder {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static Map<Integer, Integer> inorderMap = new HashMap<>();
    static int preorderIndex = 0;

    static TreeNode buildTree(int[] preorder, int[] inorder) {

        inorderMap.clear();
        preorderIndex = 0;

        for (int i = 0; i < inorder.length; i++)
            inorderMap.put(inorder[i], i);

        return build(preorder, 0, inorder.length - 1);
    }

    static TreeNode build(int[] preorder, int left, int right) {

        if (left > right)
            return null;

        int rootVal = preorder[preorderIndex++];

        TreeNode root = new TreeNode(rootVal);

        int index = inorderMap.get(rootVal);

        root.left = build(preorder, left, index - 1);
        root.right = build(preorder, index + 1, right);

        return root;
    }

    static void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);

        inorder(root);
    }
}