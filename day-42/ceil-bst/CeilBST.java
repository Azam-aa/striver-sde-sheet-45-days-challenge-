public class CeilBST {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int ceil(TreeNode root, int key) {

        int ans = -1;

        while (root != null) {

            if (root.val == key)
                return root.val;

            if (root.val < key) {
                root = root.right;
            } else {
                ans = root.val;
                root = root.left;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(4);
        root.right = new TreeNode(12);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(14);

        System.out.println(ceil(root, 11));
    }
}