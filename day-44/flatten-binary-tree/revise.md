# Flatten Binary Tree to Linked List

Approach:
Morris Traversal

Pattern:
Binary Tree

TC:
O(N)

SC:
O(1)

Points:
- Traverse the tree using the current node.
- Find the rightmost node in the left subtree.
- Connect it to the current node's right subtree.
- Move the left subtree to the right.
- Set left child to null.
- Continue until all nodes form a linked list.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.