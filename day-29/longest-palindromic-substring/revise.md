# Longest Palindromic Substring

Approach:
Expand Around Center

Pattern:
Strings

TC:
O(N²)

SC:
O(1)

Points:
- Every character can be the center.
- Check odd length palindrome.
- Check even length palindrome.
- Expand while characters match.
- Track longest palindrome.

Edge Cases:
- Single character.
- Even length palindrome.
- Entire string palindrome.
- No repeated characters.