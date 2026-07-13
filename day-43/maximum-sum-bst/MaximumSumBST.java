public class MaximumSumBST {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int maxSum = 0;

    static class NodeValue {

        int minNode, maxNode, sum;

        NodeValue(int minNode, int maxNode, int sum) {
            this.minNode = minNode;
            this.maxNode = maxNode;
            this.sum = sum;
        }
    }

    static int maxSumBST(TreeNode root) {

        maxSum = 0;

        postOrder(root);

        return maxSum;
    }

    static NodeValue postOrder(TreeNode root) {

        if (root == null)
            return new NodeValue(
                    Integer.MAX_VALUE,
                    Integer.MIN_VALUE,
                    0);

        NodeValue left = postOrder(root.left);
        NodeValue right = postOrder(root.right);

        if (left.maxNode < root.val &&
            root.val < right.minNode) {

            int currSum = left.sum + right.sum + root.val;

            maxSum = Math.max(maxSum, currSum);

            return new NodeValue(
                    Math.min(root.val, left.minNode),
                    Math.max(root.val, right.maxNode),
                    currSum);
        }

        return new NodeValue(
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                Math.max(left.sum, right.sum));
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(4);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(5);

        root.right.right.left = new TreeNode(4);
        root.right.right.right = new TreeNode(6);

        System.out.println(maxSumBST(root));
    }
}