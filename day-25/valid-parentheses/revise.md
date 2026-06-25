# Valid Parentheses

Approach:
Stack

Pattern:
Matching Brackets

TC:
O(N)

SC:
O(N)

Points:
- Push opening brackets.
- For closing bracket, pop and compare.
- If mismatch -> false.
- Stack should be empty at end.

Edge Cases:
- Empty string.
- Extra opening bracket.
- Extra closing bracket.
- Wrong bracket order.