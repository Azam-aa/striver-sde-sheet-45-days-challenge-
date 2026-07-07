public class LowestCommonAncestor {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p,
                                         TreeNode q) {

        if (root == null || root == p || root == q)
            return root;

        TreeNode left =
                lowestCommonAncestor(root.left, p, q);

        TreeNode right =
                lowestCommonAncestor(root.right, p, q);

        if (left == null)
            return right;

        if (right == null)
            return left;

        return root;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;
        TreeNode q = root.right;

        TreeNode ans =
                lowestCommonAncestor(root, p, q);

        System.out.println(ans.val);
    }
}