import java.util.*;

public class VerticalOrderTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Tuple {

        Node node;
        int row;
        int col;

        Tuple(Node node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    static List<List<Integer>> verticalTraversal(Node root) {

        TreeMap<Integer,
                TreeMap<Integer,
                PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Tuple> queue = new LinkedList<>();

        queue.offer(new Tuple(root, 0, 0));

        while (!queue.isEmpty()) {

            Tuple t = queue.poll();

            map.putIfAbsent(t.col, new TreeMap<>());

            map.get(t.col)
                    .putIfAbsent(t.row,
                            new PriorityQueue<>());

            map.get(t.col)
                    .get(t.row)
                    .offer(t.node.data);

            if (t.node.left != null)
                queue.offer(new Tuple(
                        t.node.left,
                        t.row + 1,
                        t.col - 1));

            if (t.node.right != null)
                queue.offer(new Tuple(
                        t.node.right,
                        t.row + 1,
                        t.col + 1));
        }

        List<List<Integer>> ans =
                new ArrayList<>();

        for (TreeMap<Integer,
                PriorityQueue<Integer>> rows
                : map.values()) {

            List<Integer> list =
                    new ArrayList<>();

            for (PriorityQueue<Integer> pq
                    : rows.values()) {

                while (!pq.isEmpty())
                    list.add(pq.poll());
            }

            ans.add(list);
        }

        return ans;
    }

    public static void main(String[] args) {

        Node root = new Node(3);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(
                verticalTraversal(root)
        );
    }
}