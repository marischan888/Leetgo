# Binary Search
## Concept - Dividing
Recursively reduction to reach the target. <br>
But using recursion wastes lots of resource, not recommended.
## Time Complexity
O(logn)
## Key Ideas
[How to solve?](https://www.bilibili.com/video/BV1d54y1q7k7/?spm_id_from=333.1007.top_right_bar_window_history.content.click&vd_source=061f732f43936e712914b1686ff68d18o)
- The given array can not be 100% unsorted, understand what will the valid input(P153 & P 154)
- Not too many edge case ()
- What is the color area

## Related Questions
### Binary Search on an array (BS the position)
1. P704 -- Easy
2. P35 -- Easy
3. P34 -- Medium (IMPORTANT)
4. P153 -- Medium (IMPORTANT) 
5. P154 -- Hard (IMPORTANT) -> Best case is logN, worst case is N + logN (decrease the overall operation steps as much as possible.)
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

## Others
* (7 + 3 - 1)/3 = 3 is the best way to optimal the integer division (if u want 7/2 = 3). -> P875