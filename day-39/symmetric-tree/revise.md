# Symmetric Tree

Approach:
DFS + Recursion

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Compare left subtree with right subtree.
- Both nodes must have the same value.
- Left.left ↔ Right.right.
- Left.right ↔ Right.left.
- Continue recursively until all mirror nodes match.

Edge Cases:
- Empty tree.
- Single node.
- Perfect symmetric tree.
- Asymmetric structure.
- Different node values.