# Flood Fill

Approach:
DFS

Pattern:
Graph Traversal

TC:
O(M × N)

SC:
O(M × N)

Points:
- Start DFS from the source pixel.
- Store the original color.
- Skip processing if the original color equals the new color.
- Visit only four directions (up, right, down, left).
- Recolor every connected cell having the original color.

Edge Cases:
- Source already has the target color.
- Single cell image.
- Entire image has the same color.
- No neighboring cells with the original color.
- Boundary cells.