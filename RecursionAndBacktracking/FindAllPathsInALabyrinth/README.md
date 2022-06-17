# Recursive Factorial
* You are given a labyrinth. Your goal is to find all paths from the start (cell 0, 0) to the exit, marked with 'e'.
  * Empty cells are marked with a dash '-'
  * Walls are marked with a star '*'
* On the first line, you will receive the dimensions of the labyrinth. Next you will receive the actual labyrinth.
The order of the paths does not matter.
``` 
Examples
    Input
    3
    3
    ---
    -*-
    --e
    Output
    RRDD
    DDRR
  --------
    Input
    3
    5
    -**-e
    -----
    *****
    Output
    DRRRRU
    DRRRUR
```
### Hints
* Create methods for reading and finding all paths in the labyrinth.
Create a static list that will hold every direction (basically the path)
* Finding all paths should be recursive
* Implement all helper methods that are present in the code above.