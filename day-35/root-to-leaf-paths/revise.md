# Root to Leaf Paths

Approach:
DFS + Backtracking

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Start DFS from root.
- Store current path.
- If leaf node is reached, save the path.
- Backtrack after visiting children.
- Remove current node before returning.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.