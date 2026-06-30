# String to Integer (atoi)

Approach:
Simulation

Pattern:
String Processing

TC:
O(N)

SC:
O(1)

Points:
- Skip leading spaces.
- Handle '+' or '-' sign.
- Convert digits one by one.
- Check overflow before returning.
- Stop when a non-digit is found.

Edge Cases:
- Leading spaces.
- Positive/Negative sign.
- Overflow.
- Empty string.
- String starts with letters.
```