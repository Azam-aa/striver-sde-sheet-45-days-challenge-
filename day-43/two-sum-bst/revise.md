# Two Sum IV - Input is a BST

Approach:
DFS + HashSet

Pattern:
Binary Search Tree

TC:
O(N)

SC:
O(N)

Points:
- Traverse the tree using DFS.
- Store visited node values in a HashSet.
- For each node, check if (target - node.val) exists.
- If found, return true.
- Otherwise continue traversal.

Edge Cases:
- Empty tree.
- Single node.
- Duplicate values.
- Target not possible.
- Negative node values.