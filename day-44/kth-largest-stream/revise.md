# Kth Largest Element in a Stream

Approach:
Min Heap

Pattern:
Heap (Priority Queue)

TC:
- Constructor: O(N log K)
- add(): O(log K)

SC:
O(K)

Points:
- Maintain a min heap of size K.
- Insert every incoming element into the heap.
- If the heap size exceeds K, remove the smallest element.
- The heap top always represents the kth largest element.
- Efficient for continuous stream updates.

Edge Cases:
- Empty initial array.
- k = 1.
- Duplicate values.
- Negative values.
- Large input stream.