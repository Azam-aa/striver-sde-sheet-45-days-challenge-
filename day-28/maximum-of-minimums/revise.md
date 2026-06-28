# Maximum of Minimums

Approach:
Previous Smaller + Next Smaller

Pattern:
Monotonic Stack

TC:
O(N)

SC:
O(N)

Points:
- Find Previous Smaller Element.
- Find Next Smaller Element.
- Window length = NSE - PSE - 1.
- Current element becomes minimum for that window.
- Fill remaining answers from right.

Edge Cases:
- Increasing array.
- Decreasing array.
- Duplicate values.
- Single element.