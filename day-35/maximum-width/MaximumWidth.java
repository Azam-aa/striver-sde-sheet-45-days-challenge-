import java.util.*;

public class MaximumWidth {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {

        Node node;
        long index;

        Pair(Node node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    static int widthOfBinaryTree(Node root) {

        if (root == null)
            return 0;

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        int ans = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            long min = queue.peek().index;

            long first = 0;
            long last = 0;

            for (int i = 0; i < size; i++) {

                Pair curr = queue.poll();

                long idx = curr.index - min;

                if (i == 0)
                    first = idx;

                if (i == size - 1)
                    last = idx;

                if (curr.node.left != null)
                    queue.offer(new Pair(
                            curr.node.left,
                            2 * idx + 1));

                if (curr.node.right != null)
                    queue.offer(new Pair(
                            curr.node.right,
                            2 * idx + 2));
            }

            ans = Math.max(
                    ans,
                    (int) (last - first + 1)
            );
        }

        return ans;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(3);
        root.right = new Node(2);

        root.left.left = new Node(5);
        root.left.right = new Node(3);

        root.right.right = new Node(9);

        System.out.println(
                widthOfBinaryTree(root)
        );
    }
}