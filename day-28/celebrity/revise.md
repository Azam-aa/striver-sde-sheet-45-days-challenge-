# Celebrity

Approach:
Stack Elimination

Pattern:
Stack

TC:
O(N)

SC:
O(N)

Points:
- Push all people into stack.
- Remove two people at a time.
- One can never be celebrity.
- Verify final candidate.
- Celebrity knows nobody and everyone knows celebrity.

Edge Cases:
- No celebrity.
- Only one person.
- Multiple people.
- Candidate fails verification.