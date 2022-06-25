# Combinations without Repetition
* Modify the solution from the problem 3 program to skip duplicates, e.g. (1 1) is not valid.

``` 
Examples
    Input
       3
       2
    Output
    1 2
    1 3
    2 3
    
    Comments
    • n=3 => we have a set of three elements {1, 2, 3}
    • k=2 => we select two elements out of the three each time
    • Duplicates are not allowed, meaning (1 1) is not a        
        valid combination.
   -------------------------------------
   Input
       5
       3
    Output
    1 2 3
    1 2 4
    1 2 5
    1 3 4
    1 3 5
    1 4 5
    2 3 4
    2 3 5
    2 4 5
    3 4 5
    
    Comments
    • Select 3 elements out of 5 – {1, 2, 3, 4, 5}, 
      a total of 10 combinations
    
```
