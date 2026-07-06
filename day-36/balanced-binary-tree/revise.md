# Balanced Binary Tree

Approach:
DFS + Height

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Compute left subtree height.
- Compute right subtree height.
- If height difference > 1, return -1.
- Propagate -1 upward for early termination.
- Otherwise return current subtree height.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.