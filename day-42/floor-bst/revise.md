# Floor in BST

Approach:
BST Traversal

Pattern:
Binary Search Tree

TC:
O(H)

SC:
O(1)

Points:
- Floor is the greatest value ≤ key.
- If current value equals key, return it.
- If current value is greater, move left.
- Otherwise update answer and move right.
- Continue until traversal ends.

Edge Cases:
- Empty tree.
- Key smaller than minimum.
- Key greater than maximum.
- Exact match.
- Skewed BST.