# BST Iterator

Approach:
Controlled Inorder Traversal

Pattern:
Binary Search Tree

TC:
- next() : O(1) Amortized
- hasNext() : O(1)

SC:
O(H)

Points:
- Maintain a stack of left nodes.
- Initially push the complete left chain.
- next() pops the top node.
- Push the left chain of its right subtree.
- hasNext() checks whether the stack is empty.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed BST.
- Right skewed BST.
- Balanced BST.