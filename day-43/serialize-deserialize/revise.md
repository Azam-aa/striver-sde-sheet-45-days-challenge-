# Serialize and Deserialize Binary Tree

Approach:
Level Order Traversal (BFS)

Pattern:
Binary Tree

TC:
Serialize: O(N)

Deserialize: O(N)

SC:
O(N)

Points:
- Serialize using level-order traversal.
- Store null nodes as "#".
- Separate values using commas.
- During deserialization, reconstruct the tree level by level.
- Use a queue to connect children correctly.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.