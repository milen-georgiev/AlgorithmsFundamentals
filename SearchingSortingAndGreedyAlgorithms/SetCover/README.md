# Set Cover
* Write a program that finds the smallest subset of sets, which contains all elements from a given sequence.
  In the Set Cover Problem, we are given two sets - a set of sets (we’ll call it sets) and a universe (a sequence). The sets contain all elements from the universe and no others, however, some elements are repeated. The task is to find the smallest subset of sets that contains all elements in the universe. Use the Main class from your skeleton.

``` 
Examples
    Input
        Universe: 1, 2, 3, 4, 5
        Number of sets: 4
        1
        2, 4
        5
        3
    Output
        Sets to take (4):
        { 2, 4 }
        { 1 }
        { 5 }
        { 3 }
    --------------------------------------
    Input
        Universe: 1, 2, 3, 4, 5
        Number of sets: 4
        1, 2, 3, 4, 5
        2, 3, 4, 5
        5
        3
    Output
        Sets to take (1):
        { 1, 2, 3, 4, 5 }
    --------------------------------------
    Input
        Universe: 1, 3, 5, 7, 9, 11, 20, 30, 40
        Number of sets: 6
        20
        1, 5, 20, 30
        3, 7, 20, 30, 40
        9, 30
        11, 20, 30, 40
        3, 7, 40
    Output
        Sets to take (4):
        { 3, 7, 20, 30, 40 }
        { 1, 5, 20, 30 }
        { 9, 30 }
        { 11, 20, 30, 40 }
```

#### Greedy Approach
  Using the greedy approach, at each step, we’ll take the set which contains the most elements present in the universe which we haven’t yet taken. At the first step, we’ll always take the set with the largest number of elements, but it gets a bit more complicated afterward. To simplify our job (and not check against two sets at the same time), when taking a set, we can remove all elements in it from the universe. We can also remove the set from the sets we’re considering.
#### Greedy Algorithm Implementation
You are given sample input in the main() method, your task is to complete the chooseSets() method:

The method will return a list of arrays, so first thing’s first, initialize the resulting list:

As discussed in the previous section, we’ll be removing elements from the universe, so we’ll be repeating the next steps until the universe is empty:

The hardest part is selecting a set. We need to get the set that has the most elements contained in the universe. We need to find the one with the most elements in the universe:

The above code finds the one set with most elements contained in the universe
Once we have the set we’re looking for, the next steps are trivial. Complete the TODOs below:

This is all, we just need to run the unit tests to make sure we didn’t make a mistake along the way.
