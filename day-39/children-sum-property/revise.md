# Children Sum Property

Approach:
DFS + Recursion

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- Parent value should equal sum of children.
- If children sum is greater, update parent.
- Otherwise update child nodes.
- Recurse on left and right subtrees.
- While returning, update parent as left + right.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.