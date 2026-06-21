# Median Of Two Sorted Arrays

Approach: Binary Search Partition

TC: O(log(min(N,M)))

SC: O(1)

Pattern:
Binary Search

Points:
- Binary search on smaller array.
- Create valid partition.
- Left part <= Right part.
- Calculate median directly.