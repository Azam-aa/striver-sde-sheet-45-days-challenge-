# Rotate Image

## Core Trigger

Rotate matrix by 90° clockwise.

---

## Approach

* Transpose matrix.
* Reverse every row.

---

## Gotcha

* Start transpose from j = i + 1.
* Avoid swapping twice.

---

## Why?

Transpose converts rows into columns.

Reversing rows gives 90° clockwise rotation.

---

## Complexity

TC: O(N²)

SC: O(1)

---

## Memory Trick

Transpose → Reverse Row
