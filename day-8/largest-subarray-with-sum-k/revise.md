# Pascal's Triangle

## Observation

* First element = 1
* Last element = 1
* Middle element = Top Left + Top Right
* Row i contains i + 1 elements

---

## Approach

* Create rows one by one.
* Boundary elements are always 1.
* For middle elements, use previous row values.
* Store each completed row in answer list.

---

## Important Java Concepts

* ans = stores complete triangle
* row = current row
* add() = insert element
* get() = access element

---

## Complexity

Time Complexity: O(N²)

Space Complexity: O(N²)

---

## Memory Trick

Boundary = 1

Middle = Left + Right from previous row
