# Validate BST

Approach:
DFS + Range Validation

Pattern:
Binary Search Tree

TC:
O(N)

SC:
O(H)

Points:
- Maintain valid range (min, max).
- Every node must satisfy min < node < max.
- Left subtree updates the upper bound.
- Right subtree updates the lower bound.
- Use long values to avoid integer overflow.

Edge Cases:
- Empty tree.
- Single node.
- Duplicate values.
- Invalid BST.
- Integer.MIN_VALUE / Integer.MAX_VALUE.