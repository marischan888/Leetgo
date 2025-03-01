# Binary Search
## Concept - Dividing
Recursively reduction to reach the target. <br>
Almost all the questions can be solved by recursion.
## Time Complexity
O(logn)
## Ideas
### Loop Condition 
1. if(nums[mid] == target) inside the loop. (P704) <br>
while(left <= right): search all the elements. <br>
**This is for the target must be inside the given array.**
2. ***if*** outside the loop for additional check. (P34, P135...) <br>
while(left < right): search one element left (target). <br>
**This is for the target might not be found.**
   
### Excluding the space: Two mids (left mid and right mid)
- mid = left + (right - left) / 2 
- mid = left + (right - left + 1) / 2

This is based on how you design the exclusion ways, <- | or | ->. **(P34 vs P135)** <br> 
To avoid the misuse of mid and lead to an infinite loop, can use the case with two element list like [1, 2] to think about.
   
## Questions Types and Related Questions
### Binary Search on an array (BS the position)
1. P704 -- Easy
2. P35 -- Easy
3. P34 -- Medium (IMPORTANT) -> Idea 2 is useful in the boundary definition.
4. P153 -- Medium (IMPORTANT) -> unordered list and dynamic target.
5. P154 -- Hard ?
### Binary Search the Int if we know its interval
1. P69 -- Easy (Tricky) -> overflow avoiding and BS in the naturally ascending Int.
2. P1300 -- Medium -> unordered list
3. P287 ?
### Binary Search in the case with complex filter condition

## Conclusion for BS
1. Fist, need to think about what we want to search.
2. Second, need to design how to divide the interval (exclusion)