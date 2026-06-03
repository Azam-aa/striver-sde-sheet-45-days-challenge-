# Sort Colors

## Core Trigger

Array contains only 0, 1 and 2.

---

## Approach

* Use Dutch National Flag Algorithm.
* Maintain low, mid and high pointers.
* 0 goes to left.
* 1 stays in middle.
* 2 goes to right.

---

## Rules

* 0 → swap(low, mid), low++, mid++
* 1 → mid++
* 2 → swap(mid, high), high--

---

## Gotcha

* After handling 2, do NOT increment mid.
* Check the new element again.

---

## Complexity

TC: O(N)

SC: O(1)

---

## Memory Trick

0 → Left

1 → Middle

2 → Right
