# Distinct Numbers in Each Subarray

Approach:
Sliding Window + HashMap

Pattern:
Sliding Window

TC:
O(N)

SC:
O(K)

Points:
- Maintain a fixed-size sliding window.
- Store frequencies using a HashMap.
- Remove the outgoing element from the map.
- Add the incoming element to the map.
- HashMap size gives the number of distinct elements.

Edge Cases:
- Empty array.
- k = 1.
- k = array length.
- All elements same.
- All elements distinct.