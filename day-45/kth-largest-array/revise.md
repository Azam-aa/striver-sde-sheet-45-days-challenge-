# Kth Largest Element in an Array

Approach:
Quick Select

Pattern:
Partition

TC:
Average: O(N)

Worst: O(N²)

SC:
O(1)

Points:
- Quick Select is based on Quick Sort partitioning.
- Partition places the pivot at its correct position.
- Compare pivot index with target index (n-k).
- Search only one side of the array.
- Faster than fully sorting the array.

Edge Cases:
- Single element.
- Duplicate values.
- Negative numbers.
- k = 1.
- k = array length.
```