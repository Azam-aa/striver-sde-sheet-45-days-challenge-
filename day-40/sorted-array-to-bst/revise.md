# Convert Sorted Array to Binary Search Tree

Approach:
Divide and Conquer

Pattern:
Binary Search Tree

TC:
O(N)

SC:
O(H)

Points:
- Middle element becomes the root.
- Left half forms the left subtree.
- Right half forms the right subtree.
- Recursively repeat the process.
- Produces a height-balanced BST.

Edge Cases:
- Empty array.
- Single element.
- Even number of elements.
- Odd number of elements.
- Negative values.