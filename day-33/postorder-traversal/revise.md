# Postorder Traversal

Approach:
Reverse Preorder

Pattern:
Binary Tree + Stack

Order:
Left → Right → Root

Idea:
Root → Right → Left then reverse

TC:
O(N)

SC:
O(H)

Points:
- Visit root first.
- Push left then right.
- Store answer from front.
- Final order becomes Postorder.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.