public class KthSmallest {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int count = 0;
    static int answer = 0;

    static int kthSmallest(TreeNode root, int k) {

        count = 0;
        answer = 0;

        inorder(root, k);

        return answer;
    }

    static void inorder(TreeNode root, int k) {

        if (root == null)
            return;

        inorder(root.left, k);

        count++;

        if (count == k) {
            answer = root.val;
            return;
        }

        inorder(root.right, k);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);

        System.out.println(kthSmallest(root, 3));
    }
}