# Zigzag Level Order Traversal

Approach:
BFS + Queue

Pattern:
Binary Tree

TC:
O(N)

SC:
O(N)

Points:
- Traverse tree level by level.
- Maintain a direction flag.
- Left to Right → addLast().
- Right to Left → addFirst().
- Toggle direction after every level.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.
```