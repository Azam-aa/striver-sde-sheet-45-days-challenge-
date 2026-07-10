public class PopulatingNextRightPointers {

    static class Node {

        int val;
        Node left, right, next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node connect(Node root) {

        if (root == null)
            return null;

        Node leftmost = root;

        while (leftmost.left != null) {

            Node head = leftmost;

            while (head != null) {

                head.left.next = head.right;

                if (head.next != null)
                    head.right.next = head.next.left;

                head = head.next;
            }

            leftmost = leftmost.left;
        }

        return root;
    }

    static void printLevels(Node root) {

        Node level = root;

        while (level != null) {

            Node curr = level;

            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }

            System.out.println("#");

            level = level.left;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        connect(root);

        printLevels(root);
    }
}