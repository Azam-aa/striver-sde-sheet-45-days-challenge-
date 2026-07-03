# Morris Inorder Traversal

Approach:
Threaded Binary Tree (Morris Traversal)

Pattern:
Binary Tree

Order:
Left → Root → Right

TC:
O(N)

SC:
O(1)

Points:
- No recursion.
- No stack.
- Find inorder predecessor.
- Create temporary thread to current node.
- Remove thread after visiting node.
- Visit node when left subtree is completed.

Steps:
1. If left child is null → visit node → move right.
2. Else find inorder predecessor.
3. If predecessor's right is null → create thread → move left.
4. Else remove thread → visit node → move right.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.