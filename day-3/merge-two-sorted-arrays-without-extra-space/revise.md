# Best Time to Buy and Sell Stock

## Core Trigger

Find maximum profit from one buy and one sell.

---

## Approach

* Keep track of minimum price seen so far.
* Calculate profit if sold today.
* Update maximum profit.

---

## Gotcha

* Buy must happen before sell.
* Start tracking from first element.

---

## Why?

* Cheapest price gives maximum future profit.

---

## Complexity

TC: O(N)

SC: O(1)

---

## Memory Trick

Min Price → Profit Today → Max Profit
