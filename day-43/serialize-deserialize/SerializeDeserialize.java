import java.util.*;

public class SerializeDeserialize {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static String serialize(TreeNode root) {

        if (root == null)
            return "";

        StringBuilder sb = new StringBuilder();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node == null) {

                sb.append("#,");
                continue;
            }

            sb.append(node.val).append(",");

            queue.offer(node.left);
            queue.offer(node.right);
        }

        return sb.toString();
    }

    static TreeNode deserialize(String data) {

        if (data.isEmpty())
            return null;

        String[] values = data.split(",");

        TreeNode root =
                new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int i = 1;

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (!values[i].equals("#")) {

                node.left =
                        new TreeNode(Integer.parseInt(values[i]));

                queue.offer(node.left);
            }

            i++;

            if (!values[i].equals("#")) {

                node.right =
                        new TreeNode(Integer.parseInt(values[i]));

                queue.offer(node.right);
            }

            i++;
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

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);

        root.right = new TreeNode(3);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String data = serialize(root);

        System.out.println(data);

        TreeNode restored = deserialize(data);

        inorder(restored);
    }
}