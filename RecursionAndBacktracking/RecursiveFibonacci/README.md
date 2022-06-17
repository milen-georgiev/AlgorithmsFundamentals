# Recursive Factorial
* Each member of the Fibonacci sequence is calculated from the sum of the two previous members. The first two elements are 1, 1. Therefore the sequence goes as 1, 1, 2, 3, 5, 8, 13, 21, 34…
  The following sequence can be generated with an array, but that’s easy, so your task is to implement it recursively.
  If the function getFibonacci(n) returns the nth Fibonacci number, we can express it using getFibonacci(n) = getFibonacci(n-1) + getFibonacci(n-2).
  However, this will never end and in a few seconds a Stack Overflow Exception is thrown. In order for the recursion to stop it has to have a "bottom". The bottom of the recursion is getFibonacci(1), and should return 1. The same goes for getFibonacci(0).
  #### Input
  * On the only line in the input the user should enter the wanted Fibonacci number N where 1 ≤ N ≤ 49
  #### Output
  * The output should be the nth Fibonacci number counting from 0
``` 
Examples
    Input
    3
    Output
    8
  --------
    Input
    10
    Output
    89  
    --------
    Input
    21
    Output
    17711
    
```
### Hints
* For the nth Fibonacci number, we calculate the N-1st and the N-2nd number, but for the calculation of N-1st number we calculate the N-1-1st(N-2nd) and the N-1-2nd number, so we have a lot of repeated calculations.
* If you want to figure out how to skip those unnecessary calculations, you can search for a technique called memoization.
