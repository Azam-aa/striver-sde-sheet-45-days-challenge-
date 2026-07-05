import java.util.*;

public class RootToLeafPaths {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void dfs(Node root,
                    List<Integer> path,
                    List<List<Integer>> ans) {

        if (root == null)
            return;

        path.add(root.data);

        if (root.left == null &&
            root.right == null) {

            ans.add(new ArrayList<>(path));

        } else {

            dfs(root.left, path, ans);
            dfs(root.right, path, ans);
        }

        path.remove(path.size() - 1);
    }

    static List<List<Integer>> rootToLeafPaths(Node root) {

        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, new ArrayList<>(), ans);

        return ans;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        List<List<Integer>> paths =
                rootToLeafPaths(root);

        for (List<Integer> path : paths)
            System.out.println(path);
    }
}