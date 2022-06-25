# Combinations with Repetition
* Write a recursive program for generating and printing all combinations with duplicates of k elements from a set of n elements (k <= n). In combinations, the order of elements doesn’t matter, therefore (1 2) and (2 1) are the same combination, meaning that once you print/obtain (1 2), (2 1) is no longer valid.
``` 
Examples
    Input
       * 3
       * 2
    Output
       * 1 1
       * 1 2
       * 1 3
       * 2 2
       * 2 3
       * 3 3
       
    Comments
    
    • n=3 => we have a set of three elements {1, 2, 3}
    • k=2 => we select two elements out of the three each time
    • Duplicates are allowed, meaning (1 1) is a valid combination.
    
    
```
