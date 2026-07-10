# Search in BST

Approach:
Iterative BST Search

Pattern:
Binary Search Tree

TC:
O(H)

SC:
O(1)

Points:
- Compare target with current node.
- If equal, return the node.
- If target is smaller, move left.
- If target is larger, move right.
- Continue until node is found or tree ends.

Edge Cases:
- Empty tree.
- Single node.
- Target is root.
- Target not present.
- Left and right skewed BST.