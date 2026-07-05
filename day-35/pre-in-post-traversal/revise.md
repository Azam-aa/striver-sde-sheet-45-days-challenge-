# Pre, In & Post Traversal

Approach:
Single Stack

Pattern:
Binary Tree + Stack

TC:
O(N)

SC:
O(N)

States:
1 → Preorder
2 → Inorder
3 → Postorder

Points:
- Push root with state = 1.
- State 1 → Preorder + Left.
- State 2 → Inorder + Right.
- State 3 → Postorder.
- One traversal generates all three orders.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.