# Vertical Order Traversal

Approach:
BFS + TreeMap + PriorityQueue

Pattern:
Binary Tree

TC:
O(N log N)

SC:
O(N)

Points:
- Store (column,row,node).
- TreeMap sorts columns.
- Inner TreeMap sorts rows.
- PriorityQueue handles same row & column.
- Traverse level order using BFS.

Edge Cases:
- Empty tree.
- Single node.
- Duplicate values.
- Same row & same column.
```