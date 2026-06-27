# Sliding Window Maximum

Approach:
Monotonic Deque

Pattern:
Sliding Window + Deque

TC:
O(N)

SC:
O(K)

Points:
- Store indices in deque.
- Remove out-of-window indices.
- Remove smaller elements from back.
- Front always stores maximum.
- Record answer after first window.

Edge Cases:
- k = 1.
- k = n.
- Duplicate values.
- Negative numbers.