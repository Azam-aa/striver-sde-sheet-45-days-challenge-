# Morris Preorder Traversal

Approach:
Threaded Binary Tree

Pattern:
Binary Tree

Order:
Root → Left → Right

TC:
O(N)

SC:
O(1)

Points:
- No recursion.
- No stack.
- Visit node before moving left.
- Create temporary thread.
- Remove thread after returning.
- Traverse each edge at most twice.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.