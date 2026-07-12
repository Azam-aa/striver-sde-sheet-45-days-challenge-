# Ceil in BST

Approach:
BST Traversal

Pattern:
Binary Search Tree

TC:
O(H)

SC:
O(1)

Points:
- Ceil is the smallest value ≥ key.
- If current value equals key, return it.
- If current value is smaller, move right.
- Otherwise update answer and move left.
- Continue until traversal ends.

Edge Cases:
- Empty tree.
- Key smaller than minimum.
- Key greater than maximum.
- Exact match.
- Skewed BST.