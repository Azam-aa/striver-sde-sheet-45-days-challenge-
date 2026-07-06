# Level Order Traversal

Approach:
Breadth First Search (BFS)

Pattern:
Binary Tree + Queue

TC:
O(N)

SC:
O(N)

Points:
- Traverse tree level by level.
- Use Queue for BFS.
- Process one complete level at a time.
- Store nodes level-wise.
- Add left child before right child.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.