# Bottom View of Binary Tree

Approach:
BFS + Horizontal Distance

Pattern:
Binary Tree + Queue + TreeMap

TC:
O(N log N)

SC:
O(N)

Points:
- Assign horizontal distance (HD) to every node.
- Root HD = 0.
- Left child HD = HD - 1.
- Right child HD = HD + 1.
- Update the latest node at every HD.
- TreeMap keeps HDs sorted.

Edge Cases:
- Empty tree.
- Single node.
- Left skewed tree.
- Right skewed tree.
- Complete binary tree.