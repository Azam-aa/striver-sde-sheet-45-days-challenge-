# Construct BST from Preorder

Approach:
DFS + Upper Bound

Pattern:
Binary Search Tree

TC:
O(N)

SC:
O(H)

Points:
- Traverse preorder once.
- Maintain a global index.
- Use an upper bound for recursion.
- Left subtree values < root.
- Right subtree values < current bound.
- No HashMap required.

Edge Cases:
- Empty preorder.
- Single node.
- Left skewed BST.
- Right skewed BST.
- Balanced BST.