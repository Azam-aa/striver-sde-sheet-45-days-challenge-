public class ChildrenSumProperty {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void reorder(Node root) {

        if (root == null)
            return;

        int child = 0;

        if (root.left != null)
            child += root.left.data;

        if (root.right != null)
            child += root.right.data;

        if (child >= root.data)
            root.data = child;
        else {

            if (root.left != null)
                root.left.data = root.data;

            if (root.right != null)
                root.right.data = root.data;
        }

        reorder(root.left);
        reorder(root.right);

        int total = 0;

        if (root.left != null)
            total += root.left.data;

        if (root.right != null)
            total += root.right.data;

        if (root.left != null || root.right != null)
            root.data = total;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(40);

        root.left = new Node(10);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(5);

        root.right.left = new Node(30);
        root.right.right = new Node(40);

        reorder(root);

        inorder(root);
    }
}