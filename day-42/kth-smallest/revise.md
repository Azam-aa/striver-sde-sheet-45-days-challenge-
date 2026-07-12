# Kth Smallest Element in BST

Approach:
Inorder Traversal

Pattern:
Binary Search Tree

TC:
O(N)

SC:
O(H)

Points:
- Inorder traversal of a BST gives nodes in sorted order.
- Maintain a counter while traversing.
- Increment the counter after visiting each node.
- When the counter equals k, store the answer.
- Continue traversal or stop if desired.

Edge Cases:
- Empty tree.
- Single node.
- k = 1.
- k = number of nodes.
- Left and right skewed BST.