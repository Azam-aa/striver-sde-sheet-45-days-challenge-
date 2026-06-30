# Repeated String Match

Approach:
String Builder

Pattern:
Strings

TC:
O((N + M) × M)

SC:
O(N + M)

Points:
- Keep appending string a.
- Stop when length >= b.
- Check if b exists.
- Append one extra time if needed.
- Otherwise return -1.

Edge Cases:
- Already present.
- Need one extra append.
- Impossible case.
- Single character strings.