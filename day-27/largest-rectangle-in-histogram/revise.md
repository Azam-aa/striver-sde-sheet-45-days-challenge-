# Largest Rectangle in Histogram

Approach:
Monotonic Increasing Stack

Pattern:
Stack

TC:
O(N)

SC:
O(N)

Points:
- Maintain increasing stack.
- Pop when smaller element appears.
- Width = CurrentIndex - PreviousSmaller - 1
- Area = Height × Width
- Update maximum area.

Edge Cases:
- Increasing heights.
- Decreasing heights.
- Single bar.
- All equal heights.