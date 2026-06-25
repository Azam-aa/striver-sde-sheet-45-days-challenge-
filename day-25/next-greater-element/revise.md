# Next Greater Element I

Approach:
Monotonic Stack + HashMap

Pattern:
Stack

TC:
O(N)

SC:
O(N)

Points:
- Traverse from right to left.
- Remove smaller elements from stack.
- Stack top = next greater element.
- Store answer in HashMap.
- Build answer using nums1.

Edge Cases:
- No greater element.
- Increasing array.
- Decreasing array.