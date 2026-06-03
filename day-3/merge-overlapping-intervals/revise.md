# Merge Overlapping Intervals

## Core Trigger

Intervals are given.
Need to combine overlapping intervals.

---

## Approach

* Sort intervals by start time.
* Take first interval.
* Check overlap with previous interval.
* Overlap -> Merge.
* No Overlap -> Add new interval.

---

## Overlap Condition

currentStart <= previousEnd

---

## Merge Logic

newEnd = max(previousEnd, currentEnd)

---

## Gotcha

Sort first.
Without sorting, overlap checking fails.

---

## Complexity

TC: O(N log N)

SC: O(N)

---

## Memory Trick

Sort

↓

Overlap?

Yes -> Merge

No -> Add New Interval
