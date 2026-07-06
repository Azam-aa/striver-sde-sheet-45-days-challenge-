# Maximum Depth of Binary Tree

Approach:
DFS + Recursion

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Height of null node = 0.
- Recursively compute left height.
- Recursively compute right height.
- Return 1 + max(leftHeight, rightHeight).
- Root height is the answer.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.