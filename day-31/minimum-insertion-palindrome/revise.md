# Minimum Insertion Steps to Make a String Palindrome

Approach:
Longest Palindromic Subsequence (LPS)

Pattern:
LCS + Dynamic Programming

Formula:
Answer = Length - LPS

LPS = LCS(String, Reverse(String))

TC:
O(N²)

SC:
O(N²)

Points:
- Reverse the string.
- Find LCS between original and reversed string.
- LCS becomes Longest Palindromic Subsequence.
- Minimum insertions = n - LPS.

Edge Cases:
- Already palindrome.
- Single character.
- Empty string.
- All characters different.