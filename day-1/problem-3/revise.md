# Next Permutation

## Core Trigger

Find the next lexicographically greater arrangement.

---

## Approach

* Find breakpoint from right.
* Breakpoint = first element smaller than next element.
* Find next greater element from right.
* Swap both elements.
* Reverse remaining right portion.

---

## Gotcha

* If no breakpoint exists:
* Array is in descending order.
* Reverse entire array.

---

## Complexity

Time Complexity: O(N)

Space Complexity: O(1)

---

## Memory Trick

Breakpoint → Swap → Reverse
