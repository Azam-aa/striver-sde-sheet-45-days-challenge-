# Construct Binary Tree from Preorder and Inorder

Approach:
DFS + HashMap

Pattern:
Binary Tree

TC:
O(N)

SC:
O(N)

Points:
- First preorder element is the root.
- Use HashMap to find root index in inorder.
- Left subtree is before root in inorder.
- Right subtree is after root in inorder.
- Build recursively.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.