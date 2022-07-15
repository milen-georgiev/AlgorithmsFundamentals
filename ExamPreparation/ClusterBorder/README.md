# Cluster Border
* Still after decades of space voyagers we have discovered new worlds and our species has spread all over the universe. We have not forgotten our old ways and we tend to stick to them as something important and something to worship something foolish like… tradition.
  There is a war going on between different Clusters and borders have been set, which means there is border control. You are part of the Laniakea Supercluster border control IT team.
  You have been assigned task to develop a program which maximizes the work of the administration.
  There is the way in which this works all the spaceships come in line one after the other.
  There are two ways of processing the ships the first is to check a single ship and the other is to check one ship but let two pass as long as the first guaranties for the second (which means that those two ships have to agree for that) or said in a simpler way to pass as a pair, however a ship can only make an agreement with the ship before him or the ship after him in the line, since reorder is not allowed.
  But here is the problem since the paperwork (yes, the public administration will still use paper even thousands of decades from now), takes different amount of time for each type of ship and for each pair of ships making a deal with other ships will not always benefit in time.
  You will be given two integer sequences the first is the time for each ship to pass as single client, the second one will represent the time of ships passing if they go as pair.
  You have to find the minimum time of ships processing and display that then you need to print the order of the ships passing as numbers, not times.
    1. Input
       The input will come from the console on two lines.
       • On the first line the sequence representing the time for each ship to go through.
       • On the second line the sequence representing the time for two ships combination.
    2. Output
       First print the minimum time for processing all the ships. In the format: "Optimal Time: {optimalTime}"
       • Then print the ships with their pair.
       • If ship has no pair "Single {shipNumber}"
       • If there is pair "Pair of {shipNumber} and {shipNumber}"
    3. Constraints
       • All input lines will be valid integers you do not need to check that.
       • The range of the sequences will be [1…1000]
``` 
Examples

Input
8 5 3 9 2 1 4 4 1 17
1 3 9 4 2 4 9 3 8

Output
Optimal Time: 24
Pair of 1 and 2
Single 3
Pair of 4 and 5
Pair of 6 and 7
Single 8
Pair of 9 and 10


--------------------------------
Input
12 24 3 1 22 1 9 1
1 50 10 12 5 8 7

Output
Optimal Time: 17
Pair of 1 and 2
Single 3
Single 4
Pair of 5 and 6
Pair of 7 and 8

    
```
