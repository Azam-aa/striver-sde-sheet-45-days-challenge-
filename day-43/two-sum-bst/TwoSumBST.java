import java.util.*;

public class TwoSumBST {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static Set<Integer> set = new HashSet<>();

    static boolean findTarget(TreeNode root, int k) {

        if (root == null)
            return false;

        if (set.contains(k - root.val))
            return true;

        set.add(root.val);

        return findTarget(root.left, k) ||
               findTarget(root.right, k);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(7);

        System.out.println(findTarget(root, 9));
    }
}