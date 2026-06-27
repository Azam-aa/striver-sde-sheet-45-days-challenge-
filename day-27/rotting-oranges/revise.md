# Rotting Oranges

Approach:
Multi Source BFS

Pattern:
Graph + BFS

TC:
O(M × N)

SC:
O(M × N)

Points:
- Push all rotten oranges first.
- BFS spreads rot level by level.
- One BFS level = One minute.
- Count fresh oranges.
- Return -1 if fresh oranges remain.

Edge Cases:
- No fresh oranges.
- No rotten oranges.
- All rotten initially.
- Isolated fresh orange.