# Right Side View

Approach:
Level Order Traversal (BFS)

Pattern:
Binary Tree + Queue

TC:
O(N)

SC:
O(N)

Points:
- Traverse tree level by level.
- Store the last node of every level.
- Last node is visible from the right side.
- Queue helps process each level.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.