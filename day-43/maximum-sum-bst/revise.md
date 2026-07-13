# Maximum Sum BST in Binary Tree

Approach:
Postorder DFS

Pattern:
Binary Tree + BST Validation

TC:
O(N)

SC:
O(H)

Points:
- Traverse the tree using postorder.
- For every subtree, maintain minimum value, maximum value and subtree sum.
- Check whether the current subtree satisfies BST properties.
- Update the global maximum sum whenever a valid BST is found.
- Return invalid boundaries for non-BST subtrees.

Edge Cases:
- Empty tree.
- Single node.
- All negative values.
- Entire tree is a BST.
- BST exists only as a subtree.
```