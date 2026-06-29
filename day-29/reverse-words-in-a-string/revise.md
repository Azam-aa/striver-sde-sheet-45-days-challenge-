# Reverse Words in a String

Approach:
Split + Reverse Traversal

Pattern:
Strings

TC:
O(N)

SC:
O(N)

Points:
- Remove leading/trailing spaces.
- Split using "\\s+".
- Traverse from last word.
- Join using StringBuilder.
- Ignore multiple spaces.

Edge Cases:
- Leading spaces.
- Trailing spaces.
- Multiple spaces.
- Single word.