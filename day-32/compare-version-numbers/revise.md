# Compare Version Numbers

Approach:
Split + Compare

Pattern:
Strings

TC:
O(N + M)

SC:
O(N + M)

Points:
- Split by ".".
- Compare each revision.
- Missing revision = 0.
- Ignore leading zeros.
- Return 1, -1 or 0.

Edge Cases:
- Different lengths.
- Leading zeros.
- Trailing zeros.
- Equal versions.