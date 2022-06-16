# Generating 0/1 Vectors
* Generate all n-bit vectors of zeroes and ones in lexicographic order.
``` 
Examples
    Input
    3
    Output
    000
    001
    010
    011
    100
    101
    110
    111
  --------
    Input
    5
    Output
    00000
    00001
    00010
    …
    11110
    11111
```
### Hints
* The method should receive as parameters the array which will be our vector and a current index
  Bottom of recursion should be when the index is outside of the vector
  To generate all combinations, create a for loop with a recursive call
