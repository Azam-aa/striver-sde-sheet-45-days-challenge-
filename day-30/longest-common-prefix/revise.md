# Longest Common Prefix

Approach:
Horizontal Scanning

Pattern:
String

TC:
O(N × M)

SC:
O(1)

Points:
- Take first string as prefix.
- Compare with every string.
- Shrink prefix until it matches.
- Return empty string if prefix becomes empty.

Edge Cases:
- Empty array.
- Single string.
- No common prefix.
- All strings same.
- Prefix equals entire string.