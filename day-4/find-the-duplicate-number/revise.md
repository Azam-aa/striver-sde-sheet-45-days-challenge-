# Find Duplicate Number

## Core Trigger

Numbers are from 1 to n.

One number repeats.

Cannot modify array.

O(1) extra space.

---

## Approach

- Treat array as linked list.
- Use Slow and Fast pointers.
- Detect cycle.
- Find cycle starting point.

---

## Why?

Duplicate number creates a cycle.

---

## Pattern

Floyd's Cycle Detection

(Tortoise and Hare)

---

## Complexity

TC: O(N)

SC: O(1)

---

## Memory Trick

Slow

↓

Fast

↓

Meet

↓

Find Start

↓

Duplicate