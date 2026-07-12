# Kth Smallest and Largest in BST

Approach:
Inorder + Reverse Inorder Traversal

Pattern:
Binary Search Tree

TC:
O(N)

SC:
O(H)

Points:
- Inorder traversal gives nodes in ascending order.
- Reverse inorder traversal gives nodes in descending order.
- Maintain a counter during traversal.
- Stop when the counter reaches k.
- Use separate traversals for smallest and largest.

Edge Cases:
- Empty tree.
- Single node.
- k = 1.
- k = total number of nodes.
- Left and right skewed BST.