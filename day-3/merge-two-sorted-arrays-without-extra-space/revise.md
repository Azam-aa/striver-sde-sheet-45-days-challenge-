# Merge Sorted Array

## Core Trigger

Two sorted arrays.

Merge into nums1 in-place.

---

## Approach

* Start from the end.
* Compare largest elements.
* Place larger element at last position.
* Move corresponding pointer.

---

## Pointers

i = last valid element of nums1

j = last element of nums2

k = last position of nums1

---

## Gotcha

Fill from back.

Otherwise nums1 elements get overwritten.

---

## Why?

Largest element always belongs at the end.

---

## Complexity

TC: O(m + n)

SC: O(1)

---

## Memory Trick

Compare End

↓

Put Bigger Element

↓

Move Pointer

↓

Fill From Back
