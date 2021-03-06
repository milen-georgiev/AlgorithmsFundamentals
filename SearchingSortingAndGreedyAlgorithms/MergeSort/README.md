# Merge Sort
* Sort an array of elements using the famous merge sort.

``` 
Examples
    Input
        5 4 3 2 1
    Output
        1 2 3 4 5
```

#### Hints
Create your mergeSort method in Main class:


First, if we have reached the bottom of the recursion (all elements have been split into partitions of 1), we return the whole array (1 element):

Extract the index, at the middle of the array, get the lengths and initialize the two partitions of the array:

Fill the partitions with values from the main array:

Recursively, do the same for each of the two partitions of the array. Each partition gets split into two until you reach partitions of one element:

From here on, it's the backtrack of the recursion. The main logic after the split of the partitions.
This is the main index, which will be used to follow the progress on the main array, and these are the indexes for the two partitions, which will be used to follow the progress on them:


Here starts the main comparing algorithm. The loop's condition consists of both indexes, being compared to their corresponding partition lengths. Both partition indexes will be increased until one of the arrays is expired. In other words... This loop will go through both partitions, simultaneously, and will finish only when, one of the two indexes, reaches its partition's length.

Here is the comparison part. We compare the current element from the first partition, with the current element from the second partition.
In case the first partition's current element is lower, by comparison, it will be put in the current position
of the main array. If that is NOT the case, the second partition's current element will be put on
the current position of the main array. If you switch the comparing symbol, you might achieve a descending order in the sort. Currently, the algorithm sorts in ASCENDING order.

When the loop finishes, naturally, one of the two partitions should be expired. In other words. One of the two partitions' values has been traversed totally. That would mean that the other array would have some leftover values, which is why we need to store even them. Due to the fact we have nothing to compare them with, we just store them in the remaining positions of the main array:

At the end the other exit point of the recursive algorithm. Return the processed array: