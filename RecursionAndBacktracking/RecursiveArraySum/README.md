# Recursive Array Sum
* Write a program that finds the sum of all elements in an integer array. Use recursion.
  Note: In practice this recursion should not be used here (instead use an iterative solution), this is just an exercise.
``` 
Examples
    Input
    1 2 3 4
    Output
     10
  --------
    Input
    -1 0 1
    Output
    0 
```
### Hints
#### Write a recursive method. It will take as arguments the input array and the current index.
* The method should return the current element + the sum of all next elements (obtained by recursively calling it).
* The recursion should stop when there are no more elements in the array.
