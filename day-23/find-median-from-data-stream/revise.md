Pattern: Two Heaps

Max Heap -> Left Half
Min Heap -> Right Half

addNum():
1. Add to Max Heap
2. Move top to Min Heap
3. Balance heaps

findMedian():
- If odd -> Max Heap top
- If even -> Average of both tops

TC:
addNum -> O(log N)
findMedian -> O(1)

SC:
O(N)