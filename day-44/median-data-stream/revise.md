# Find Median from Data Stream

Approach:
Two Heaps

Pattern:
Heap (Priority Queue)

TC:
- addNum(): O(log N)
- findMedian(): O(1)

SC:
O(N)

Points:
- Use a max heap for the smaller half.
- Use a min heap for the larger half.
- Balance the heap sizes after every insertion.
- Max heap can have at most one extra element.
- Median is either the max heap top or the average of both heap tops.

Edge Cases:
- First element.
- Even number of elements.
- Odd number of elements.
- Duplicate values.
- Negative values.