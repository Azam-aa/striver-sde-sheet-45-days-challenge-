# Online Stock Span

Approach:
Monotonic Decreasing Stack

Pattern:
Stack

TC:
Amortized O(1)

SC:
O(N)

Points:
- Store {price, span}.
- Remove smaller/equal prices.
- Add their span to current span.
- Push current price with total span.

Edge Cases:
- Increasing prices.
- Decreasing prices.
- Duplicate prices.
- Single element.