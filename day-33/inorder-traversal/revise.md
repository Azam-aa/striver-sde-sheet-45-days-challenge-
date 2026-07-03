# Inorder Traversal

Approach:
Iterative Stack

Pattern:
Binary Tree + Stack

Order:
Left → Root → Right

TC:
O(N)

SC:
O(H)

Points:
- Keep moving left.
- Push every node.
- Pop node and visit it.
- Move to right subtree.
- Repeat until stack is empty.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.