# Recursive Factorial
Write a program that finds the factorial of a given number. Use recursion.
Note: In practice this recursion should not be used here (instead use an iterative solution), this is just an exercise.
``` 
Examples
    Input
    5
    Output
    120
  --------
    Input
    10
    Output
    3628800
```
### Hints
#### Write a recursive method. It will take as arguments an integer number.
* The method should return the current element * the result of calculating factorial of current element - 1 (obtained by recursively calling it).
* The recursion should stop when the last element is reached