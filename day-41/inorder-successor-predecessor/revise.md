# Inorder Successor and Predecessor in BST

Approach:
BST Traversal

Pattern:
Binary Search Tree

TC:
O(H)

SC:
O(1)

Points:
- Successor is the smallest value greater than the key.
- Predecessor is the largest value smaller than the key.
- Traverse using BST properties.
- Update predecessor while moving right.
- Update successor while moving left.

Edge Cases:
- Empty tree.
- Single node.
- Key is minimum.
- Key is maximum.
- Key not present in BST.