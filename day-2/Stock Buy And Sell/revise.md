# Set Matrix Zeroes

## Brute Force

* Find a zero.
* Mark its entire row and column.
* Use a special value to avoid affecting future traversals.s
* Too many traversals.

Time Complexity: O(N × M × (N + M))
Space Complexity: O(1)

---

## Better Solution

* Use extra row[] and col[] arrays.
* Store which rows and columns need to become zero.
* Traverse again and update matrix.

Time Complexity: O(N × M)
Space Complexity: O(N + M)

---

## Optimal Solution

* Use first row and first column as markers.
* No extra row[] and col[] arrays.
* Use col0 variable for first column.
* Phase 1: Mark rows and columns.
* Phase 2: Update inner matrix using markers.
* Phase 3: Handle first row.
* Phase 4: Handle first column.

Time Complexity: O(N × M)
Space Complexity: O(1)

---

## Memory Trick

Brute → Extra Traversals

Better → Extra Space

Optimal → Use First Row + First Column as Markers
