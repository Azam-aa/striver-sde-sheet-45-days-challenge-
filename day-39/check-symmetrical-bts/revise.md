# Check for Symmetrical BTs

Approach:
DFS + Recursion

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Compare left and right subtrees.
- Both nodes should be null or both should exist.
- Values must be equal.
- Compare left.left with right.right.
- Compare left.right with right.left.
- Tree is symmetrical only if every mirror pair matches.

Edge Cases:
- Empty tree.
- Single node.
- Symmetric tree.
- Different values.
- Different structure.