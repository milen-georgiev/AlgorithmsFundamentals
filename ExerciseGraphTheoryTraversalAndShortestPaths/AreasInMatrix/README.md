# Areas in Matrix
* We are given a matrix of letters of size N * M. Two cells are neighbors if they share a common wall. Write a program to find the connected areas of neighbor cells holding the same letter. Display the total number of areas and the number of areas for each alphabetical letter (ordered by alphabetical order).
  On the first line is given the number of rows.
``` 
Examples

Input
6
aacccaac
baaaaccc
baabaccc
bbdaaccc
ccdccccc
ccdccccc

Output
Areas: 8
Letter 'a' -> 2
Letter 'b' -> 2
Letter 'c' -> 3
Letter 'd' -> 1


--------------------------------
Input
3
aaa
aaa
aaa

Output
Areas: 1
Letter 'a' -> 1

    
```
#### Hint
* Initially mark all cells as unvisited. Start a recursive DFS traversal (or BFS) from each unvisited cell and mark all reached cells as visited. Each DFS traversal will find one of the connected areas.