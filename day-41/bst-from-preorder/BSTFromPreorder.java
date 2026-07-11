public class BSTFromPreorder {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int index = 0;

    static TreeNode bstFromPreorder(int[] preorder) {

        index = 0;

        return build(preorder, Integer.MAX_VALUE);
    }

    static TreeNode build(int[] preorder, int bound) {

        if (index == preorder.length || preorder[index] > bound)
            return null;

        TreeNode root = new TreeNode(preorder[index++]);

        root.left = build(preorder, root.val);
        root.right = build(preorder, bound);

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

        int[] preorder = {8, 5, 1, 7, 10, 12};

        TreeNode root = bstFromPreorder(preorder);

        inorder(root);
    }
}