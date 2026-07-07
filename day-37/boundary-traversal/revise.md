# Boundary Traversal

Approach:
Boundary Traversal

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Order:
Root → Left Boundary → Leaf Nodes → Right Boundary (Reverse)

Points:
- Print root first.
- Traverse left boundary excluding leaf nodes.
- Print all leaf nodes.
- Traverse right boundary excluding leaf nodes.
- Reverse right boundary before adding.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.