# Lowest Common Ancestor in BST

Approach:
BST Traversal

Pattern:
Binary Search Tree

TC:
O(H)

SC:
O(1)

Points:
- Use BST property to traverse.
- If both nodes are smaller, move left.
- If both nodes are larger, move right.
- Otherwise current node is the LCA.
- No recursion required.

Edge Cases:
- Empty tree.
- One node is ancestor of the other.
- Root is the LCA.
- Left skewed BST.
- Right skewed BST.