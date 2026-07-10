public class SearchBST {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode searchBST(TreeNode root, int val) {

        while (root != null && root.val != val) {

            if (val < root.val)
                root = root.left;
            else
                root = root.right;
        }

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

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode ans = searchBST(root, 2);

        inorder(ans);
    }
}