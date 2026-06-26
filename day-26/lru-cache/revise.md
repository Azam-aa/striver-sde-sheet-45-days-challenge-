# LRU Cache

Approach:
HashMap + Doubly Linked List
(Java LinkedHashMap for implementation)

Pattern:
Design

TC:
get() -> O(1)
put() -> O(1)

SC:
O(Capacity)

Points:
- Store recently used items.
- Access updates recent position.
- Remove least recently used when full.
- HashMap provides O(1) lookup.

Edge Cases:
- Key not present.
- Capacity = 1.
- Updating existing key.
- Cache full.