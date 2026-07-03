# Preorder Traversal

Approach:
Iterative Stack

Pattern:
Binary Tree + Stack

Order:
Root → Left → Right

TC:
O(N)

SC:
O(H)

Points:
- Visit root first.
- Push right child.
- Push left child.
- Left is processed before right.
- Continue until stack becomes empty.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.