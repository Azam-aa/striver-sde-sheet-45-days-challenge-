# Next Smaller Element

Approach:
Monotonic Stack

Pattern:
Stack

TC:
O(N)

SC:
O(N)

Points:
- Traverse from right.
- Remove larger elements.
- Stack top = next smaller.
- Push current element.

Edge Cases:
- Increasing array.
- Decreasing array.
- Single element.
- Duplicate values.