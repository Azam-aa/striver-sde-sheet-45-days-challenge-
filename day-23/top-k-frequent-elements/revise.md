# Top K Frequent Elements

Approach: HashMap + Min Heap

TC: O(N log K)

SC: O(N)

Pattern:
Heap

Points:
- Count frequency using HashMap.
- Maintain Min Heap of size K.
- Remove smaller frequency.
- Heap contains top K elements.