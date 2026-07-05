import java.util.*;

public class PreInPostTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    static void allTraversal(Node root) {

        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        if (root == null)
            return;

        Stack<Pair> stack = new Stack<>();

        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()) {

            Pair curr = stack.pop();

            if (curr.state == 1) {

                preorder.add(curr.node.data);

                curr.state++;

                stack.push(curr);

                if (curr.node.left != null)
                    stack.push(new Pair(curr.node.left, 1));

            } else if (curr.state == 2) {

                inorder.add(curr.node.data);

                curr.state++;

                stack.push(curr);

                if (curr.node.right != null)
                    stack.push(new Pair(curr.node.right, 1));

            } else {

                postorder.add(curr.node.data);
            }
        }

        System.out.println("Preorder : " + preorder);
        System.out.println("Inorder  : " + inorder);
        System.out.println("Postorder: " + postorder);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        allTraversal(root);
    }
}