# Lowest Common Ancestor

Approach:
DFS + Recursion

Pattern:
Binary Tree

TC:
O(N)

SC:
O(H)

Points:
- If root is null return null.
- If root equals p or q return root.
- Search left subtree.
- Search right subtree.
- If both sides return non-null, current node is LCA.
- Otherwise return the non-null subtree.

Edge Cases:
- Empty tree.
- One node is ancestor of another.
- Root is the answer.
- Both nodes in same subtree.
- Nodes in different subtrees.