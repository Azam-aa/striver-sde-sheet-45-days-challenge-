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
- If left child exists, find the rightmost node of the left subtree.
- Connect the original right subtree to that node.
- Move the left subtree to the right.
- Set left child to null.
- Continue with the right child.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.