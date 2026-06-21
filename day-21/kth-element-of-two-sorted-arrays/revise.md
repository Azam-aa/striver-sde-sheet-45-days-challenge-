# Kth Element Of Two Sorted Arrays

Approach: Binary Search Partition

TC: O(log(min(N,M)))

SC: O(1)

Pattern:
Binary Search

Points:
- Similar to Median problem.
- Partition both arrays.
- Left side contains K elements.
- Answer = max(left elements).