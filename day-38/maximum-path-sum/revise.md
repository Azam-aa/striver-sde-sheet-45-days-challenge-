# Maximum Path Sum

Approach:
DFS + Postorder

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Compute maximum gain from left subtree.
- Compute maximum gain from right subtree.
- Ignore negative contributions using max(0, gain).
- Update global answer with left + right + current node.
- Return current node + maximum gain.

Edge Cases:
- Empty tree.
- Single node.
- All negative values.
- Left skewed tree.
- Right skewed tree.
```