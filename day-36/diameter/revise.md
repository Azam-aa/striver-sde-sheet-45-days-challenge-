# Diameter of Binary Tree

Approach:
DFS + Height

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Compute height of left subtree.
- Compute height of right subtree.
- Diameter through current node = leftHeight + rightHeight.
- Update global diameter.
- Return current subtree height.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.
```