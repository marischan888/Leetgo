# Basic Sort
## Basic info
Random Access:
- Each element in array is saved in a continuous memory location, therefore it can be accessed by its index under time complexity O(1).
- It is the characteristic of Array.
## Type
### Selection Sort (Violent)
1. No useful information stored in each loop iteration -> Same time complexity for sorting both no-sorted and sorted array.
2. Low efficiency: O(N^2)
3. Concepts:
- Greedy: for each inner iteration, we choose the minimal (optimal choice in each step), after looping, Array sort!(global optimum)
- Dividing the problem into smaller sub-problem.
### Insertion Sort
1. Quit similar to the selection sort, but with loop from tail to head
2. Low efficiency: O(N^2)
3. Biggest different: can break the loop as it found the proper position
4. Sentinel Value to avoid out of bound issue - P912 
5. Check P912 for how to implement
## Problems
### Selection Sort
1. P912 --  P912 is an example for how to implement the sorting algorithms 
2. P11 -- Not suitable using selection sort when the input is large;
3. P01 -- Easy
### Insertion Sort
1. P912 --  P912 is an example for how to implement the sorting algorithms 
## Evaluations of sorting
### Time Complexity
### in-place sort
Dont need to use extra 