# Quicksort
* Sort an array of elements using the famous quicksort.

``` 
Examples
    Input
        5 4 3 2 1
    Output
        1 2 3 4 5
```

#### Hints
You can learn about the Quicksort algorithm from Wikipedia. A great tool for visualizing the algorithm (along with many others) is available at Visualgo.net.
The algorithm in short:
* Quicksort takes unsorted partitions of an array and sorts them
* We choose the pivot
* We pick the first element from the unsorted partition and move it in such a way, that all smaller elements are on its left and all greater, to its right
* With the pivot moved to its correct place, we now have two unsorted partitions – one to the left of it and one to the right
* Call the procedure recursively for each partition
* The bottom of the recursion is when a partition has a size of 1, which is by definition sorted
First, define the sorting method:


First, find the pivot index and rearrange the elements, then sort the left and right partitions recursively. Now to choose the pivot point we need to create a method called partition():