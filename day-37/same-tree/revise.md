# Same Tree

Approach:
DFS + Recursion

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Both null → true.
- One null → false.
- Values must match.
- Compare left subtrees.
- Compare right subtrees.
- Both recursive calls must return true.

Edge Cases:
- Empty trees.
- Single node.
- Different structure.
- Different values.
- Identical trees.
```