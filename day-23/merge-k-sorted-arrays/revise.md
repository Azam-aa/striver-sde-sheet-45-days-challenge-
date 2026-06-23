# Merge K Sorted Arrays

Approach: Min Heap

TC: O(N*K log K)

SC: O(K)

Pattern:
Heap

Points:
- Put first element of every array.
- Pick smallest element.
- Insert next element from same row.
- Continue until heap empty.