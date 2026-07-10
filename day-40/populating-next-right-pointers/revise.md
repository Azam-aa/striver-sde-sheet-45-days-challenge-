# Populating Next Right Pointers

Approach:
Level Traversal using Next Pointers

Pattern:
Perfect Binary Tree

TC:
O(N)

SC:
O(1)

Points:
- Start from the leftmost node of each level.
- Connect left child to right child.
- Connect right child to next node's left child.
- Move across the level using next pointers.
- Move to the next level through the left child.

Edge Cases:
- Empty tree.
- Single node.
- Perfect binary tree.
- Two-level tree.
```