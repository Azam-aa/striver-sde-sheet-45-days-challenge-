# Maximum Width of Binary Tree

Approach:
Level Order Traversal + Indexing

Pattern:
Binary Tree + BFS

TC:
O(N)

SC:
O(N)

Points:
- Assign index to every node.
- Root index = 0.
- Left child = 2*i + 1.
- Right child = 2*i + 2.
- Normalize indices at every level.
- Width = lastIndex - firstIndex + 1.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Sparse tree.
```