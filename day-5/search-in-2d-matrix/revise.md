# Maximum Subarray

## Core Trigger

Find maximum sum contiguous subarray.

---

## Approach (Kadane's Algorithm)

* Keep a running sum.
* Add current element.
* Update maximum sum.
* If running sum becomes negative, reset it to 0.

---

## Gotcha

* Update maxSum before resetting.
* Handles all negative arrays correctly.

---

## Why Reset?

Negative sum will reduce future sums.

---

## Complexity

TC: O(N)

SC: O(1)

---

## Memory Trick

Add → Update Max → Reset Negative
