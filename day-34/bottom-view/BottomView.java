import java.util.*;

public class BottomView {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static List<Integer> bottomView(Node root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair curr = queue.poll();

            map.put(curr.hd, curr.node.data);

            if (curr.node.left != null)
                queue.offer(new Pair(curr.node.left, curr.hd - 1));

            if (curr.node.right != null)
                queue.offer(new Pair(curr.node.right, curr.hd + 1));
        }

        ans.addAll(map.values());

        return ans;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(bottomView(root));
    }
}