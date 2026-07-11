public class InorderSuccessorPredecessor {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode successor(TreeNode root, int key) {

        TreeNode succ = null;

        while (root != null) {

            if (key >= root.val) {
                root = root.right;
            } else {
                succ = root;
                root = root.left;
            }
        }

        return succ;
    }

    static TreeNode predecessor(TreeNode root, int key) {

        TreeNode pred = null;

        while (root != null) {

            if (key <= root.val) {
                root = root.left;
            } else {
                pred = root;
                root = root.right;
            }
        }

        return pred;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(5);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(12);

        int key = 6;

        TreeNode pred = predecessor(root, key);
        TreeNode succ = successor(root, key);

        System.out.println("Predecessor : "
                + (pred != null ? pred.val : "null"));

        System.out.println("Successor   : "
                + (succ != null ? succ.val : "null"));
    }
}