# Construct Binary Tree from Inorder and Postorder

Approach:
DFS + HashMap

Pattern:
Binary Tree

TC:
O(N)

SC:
O(N)

Points:
- Last postorder element is the root.
- Use HashMap to locate the root in inorder.
- Build the right subtree first.
- Then build the left subtree.
- Reconstruct recursively.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.