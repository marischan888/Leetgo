# Binary Search
## Concept - Dividing
Recursively reduction to reach the target. <br>
Almost all the questions can be solved by recursion.
## Time Complexity
O(logn)
## Key Ideas
1. Choosing looping condition:
   1. (left <= right): go through **all** the element.
   2. (left < right): will have one element left. **Need to double-check the last element.**
2. Choosing narrow interval, need to think about:
   * **Base Case** like when the nums has only two elements [a, b] (or other), how to set mid/ left and right. --> **Recursion**
   * what interval u want.
   
## Related Questions
### Binary Search on an array (BS the position)
1. P704 -- Easy
2. P35 -- Easy
3. P34 -- Medium (IMPORTANT) -> It shows deeper on how to narrow. 
4. P153 -- Medium (IMPORTANT) -> Unordered list and dynamic target.
5. P154 -- Hard (IMPORTANT) --> P153 with unique number.
6. P33
7. P81
8. P278
9. P374
10. P852
11. P1095
12. P4
### Binary Search the Int if we know its interval
1. P69 -- Easy (Tricky) -> overflow avoiding and BS in the naturally ascending Int.
2. P1300 -- Medium -> unordered list
3. P287 
### Binary Search in the case with complex filter condition
1. P875 -- Medium (Tricky & Classic) -> Carefully choose the narrow way
2. P410
3. P1011
4. P1482

Notice: This kind of questions is more on **understanding** and BS is not the only way to solve.

How?
- Analysis the relationship between target we want to find and the given variables. --> Find out the target's constraints. --> Then u can use BS 
- Be aware of the given limitation from questions

## Conclusion
* Start from single mid(pointer)
* Dont put too many "if". Find out the base case to find out the evidence which can decide how to narrow the interval. (P153, P154) -- KEY POINT
* Need to design how to divide the interval (exclusion)
* Need to read the questions carefully, like ordered? duplicated? ...

## Others
* (7 + 3 - 1)/3 = 3 is the best way to optimal the integer division (if u want 7/2 = 3). -> P875