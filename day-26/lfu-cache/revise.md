# 460. LFU Cache

## Intuition

Use two HashMaps and a Doubly Linked List for each frequency.

- `keyMap` stores key → node.
- `freqMap` stores frequency → doubly linked list.
- Each list maintains LRU order among nodes having the same frequency.
- `minFreq` always stores the minimum frequency currently present.

This allows both `get()` and `put()` to work in **O(1)**.

---

## Approach

Maintain:

- Node
  - key
  - value
  - frequency
  - previous pointer
  - next pointer

- Doubly Linked List
  - insert at front
  - remove node
  - remove least recently used node (tail)

HashMaps:

- `keyMap`
  - key → Node

- `freqMap`
  - frequency → DoublyLinkedList

Whenever a key is accessed:

- Remove from old frequency list.
- Increase frequency.
- Insert into new frequency list.
- Update `minFreq` if necessary.

When cache is full:

- Remove the least recently used node from the minimum frequency list.
- Insert the new node with frequency = 1.

---

## Algorithm

### get(key)

- If key doesn't exist, return -1.
- Update its frequency.
- Return its value.

### put(key, value)

- If capacity is 0, return.
- If key already exists:
  - Update value.
  - Increase frequency.
- Else:
  - If cache is full:
    - Remove LRU node from minimum frequency list.
  - Insert new node.
  - Set frequency = 1.
  - Update `minFreq = 1`.

---

## Time Complexity

- get() → **O(1)**
- put() → **O(1)**

---

## Space Complexity

- **O(capacity)**

---

## Key Pattern

- HashMap
- Doubly Linked List
- Frequency Buckets
- Design Data Structure
- LRU + LFU Combination

---

## Edge Cases

- Capacity = 0
- Key not present
- Updating an existing key
- Multiple keys with same frequency
- Removing LRU among equal frequencies
- Empty frequency list after removal
- Updating minimum frequency

---

## Important Points

- `keyMap` provides O(1) node lookup.
- `freqMap` groups nodes by frequency.
- Each frequency maintains LRU ordering.
- `minFreq` identifies the eviction bucket.
- Every frequency update removes the node from its old list before inserting it into the new one.
- The node removed during eviction is always:
  - Lowest frequency
  - Least recently used within that frequency

---

## Interview Takeaway

Whenever a problem requires:

- Constant-time cache operations
- Frequency tracking
- LRU tie-breaking

Think of:

**HashMap + Doubly Linked List + Frequency Map**