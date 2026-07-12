public class KthSmallestLargest {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int count;
    static int kthSmallest;
    static int kthLargest;

    static int findKthSmallest(TreeNode root, int k) {

        count = 0;
        kthSmallest = -1;

        inorder(root, k);

        return kthSmallest;
    }

    static void inorder(TreeNode root, int k) {

        if (root == null)
            return;

        inorder(root.left, k);

        count++;

        if (count == k) {
            kthSmallest = root.val;
            return;
        }

        inorder(root.right, k);
    }

    static int findKthLargest(TreeNode root, int k) {

        count = 0;
        kthLargest = -1;

        reverseInorder(root, k);

        return kthLargest;
    }

    static void reverseInorder(TreeNode root, int k) {

        if (root == null)
            return;

        reverseInorder(root.right, k);

        count++;

        if (count == k) {
            kthLargest = root.val;
            return;
        }

        reverseInorder(root.left, k);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        int k = 3;

        System.out.println("Kth Smallest : "
                + findKthSmallest(root, k));

        System.out.println("Kth Largest  : "
                + findKthLargest(root, k));
    }
}