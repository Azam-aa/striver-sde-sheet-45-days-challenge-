import java.util.*;

public class BoundaryTraversal {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    static void addLeftBoundary(Node root, List<Integer> ans) {

        Node curr = root.left;

        while (curr != null) {

            if (!isLeaf(curr))
                ans.add(curr.data);

            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    static void addLeaves(Node root, List<Integer> ans) {

        if (root == null)
            return;

        if (isLeaf(root)) {

            ans.add(root.data);
            return;
        }

        addLeaves(root.left, ans);
        addLeaves(root.right, ans);
    }

    static void addRightBoundary(Node root, List<Integer> ans) {

        Node curr = root.right;

        Stack<Integer> stack = new Stack<>();

        while (curr != null) {

            if (!isLeaf(curr))
                stack.push(curr.data);

            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        while (!stack.isEmpty())
            ans.add(stack.pop());
    }

    static List<Integer> boundaryTraversal(Node root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        if (!isLeaf(root))
            ans.add(root.data);

        addLeftBoundary(root, ans);

        addLeaves(root, ans);

        addRightBoundary(root, ans);

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

        System.out.println(boundaryTraversal(root));
    }
}