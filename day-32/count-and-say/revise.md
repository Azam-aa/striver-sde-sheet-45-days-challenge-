# Count and Say

Approach:
Simulation

Pattern:
Strings

TC:
O(N × L)

SC:
O(L)

L = Length of generated string

Points:
- Start with "1".
- Count consecutive same digits.
- Append count followed by digit.
- Generate next sequence iteratively.
- Repeat until n-th term.

Edge Cases:
- n = 1
- Repeated digits.
- Long sequences.
- Single digit groups.