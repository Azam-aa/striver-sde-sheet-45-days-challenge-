# Find First Occurrence

Approach:
KMP Algorithm

Pattern:
String Matching

TC:
O(N + M)

SC:
O(M)

Points:
- Build LPS array.
- Compare text and pattern.
- On mismatch use LPS instead of restarting.
- Return first matched index.
- Return -1 if not found.

Edge Cases:
- Empty pattern.
- Pattern longer than text.
- Repeated characters.
- Pattern not present.
```