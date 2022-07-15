# Cluster Border
* We are given a directed graph. We are given also a set of pairs of vertices. Find the shortest distance between each pair of vertices or -1 if there is no path connecting them.  
  On the first line, you will get N, the number of vertices in the graph. On the second line, you will get P, the number of pairs between which to find the shortest distance.
  On the next N, lines will be the edges of the graph and on the next P lines, the pairs.
``` 
Examples

Input
2
2
1:2
2:
1-2
2-1

Output
{1, 2} -> 1
{2, 1} -> -1


--------------------------------
Input
8
4
1:4
2:4
3:4 5
4:6
5:3 7 8
6:
7:8
8:
1-6
1-5
5-6
5-8

Output
{1, 6} -> 2
{1, 5} -> -1
{5, 6} -> 3
{5, 8} -> 1

    
```
#### Hint
* For each pair use BFS to find all paths from the source to the destination vertex.