import java.util.*;

public class ZigzagLevelOrder {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            int size = queue.size();

            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                if (leftToRight)
                    level.addLast(node.val);
                else
                    level.addFirst(node.val);

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            ans.add(level);

            leftToRight = !leftToRight;
        }

        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(zigzagLevelOrder(root));
    }
}