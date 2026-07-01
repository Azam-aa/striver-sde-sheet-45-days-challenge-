# KMP Algorithm (LPS)

Approach:
KMP String Matching

Pattern:
LPS + String Matching

TC:
O(N + M)

SC:
O(M)

Points:
- Build LPS array first.
- LPS stores longest prefix which is also suffix.
- On mismatch don't restart.
- Jump using LPS.
- Linear time pattern matching.

Edge Cases:
- Empty pattern.
- Pattern longer than text.
- Repeated characters.
- Multiple occurrences.