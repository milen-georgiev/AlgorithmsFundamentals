# Nested Loops To Recursion
* Write a program that simulates the execution of n nested loops from 1 to n which prints the values of all its iteration variables at any given time on a single line. Use recursion.
``` 
Examples
    Input
       * 1 2 3 4 5 6
    Output
       * 1 1
       * 1 2
       * 2 1
       * 2 2
       
    Solution with nested loops
    (assuming n is positive)
    
    int limit = 2;

    for (int i1 = 1; i1 <= limit; i1++) {
        for (int i2 = 1; i2 <= limit; i2++) {
            System.out.println(i1 + " " + i2);
        }
    }
    
    
```
