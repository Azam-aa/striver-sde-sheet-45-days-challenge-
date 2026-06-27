# Min Stack

Approach:
Two Stack

Pattern:
Stack Design

TC:
push -> O(1)
pop -> O(1)
top -> O(1)
getMin -> O(1)

SC:
O(N)

Points:
- Maintain one normal stack.
- Maintain one minimum stack.
- Push minimum values.
- Pop from both if minimum removed.
- Top of minStack always stores minimum.

Edge Cases:
- Duplicate minimum values.
- Negative numbers.
- Single element.
- Pop minimum element.
```