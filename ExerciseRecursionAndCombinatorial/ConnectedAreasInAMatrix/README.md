# Combinations without Repetition
* Let’s define a connected area in a matrix as an area of cells in which there is a path between every two cells.
  Write a program to find all connected areas in a matrix.
  On the console, print the total number of areas found, and on a separate line some info about each of the areas – its position (top-left corner) and size.
  Order the areas by size (in descending order) so that the largest area is printed first. If several areas have the same size, order them by their position, first by the row, then by the column of the top-left corner. So, if there are two connected areas with the same size, the one which is above and/or to the left of the other will be printed first.
  On the first line, you will get the number of rows.
  On the second line, you will get the number of columns.
  The rest of the input will be the actual matrix.
``` 
Examples
    Input
        4
        9
        ---*---*-
        ---*---*-
        ---*---*-
        ----*-*--
    Output
        Total areas found: 3
        Area #1 at (0, 0), size: 13
        Area #2 at (0, 4), size: 10
        Area #3 at (0, 8), size: 5
    
    --------------------------------
    Input
        5
        10
        *--*---*--
        *--*---*--
        *--*****--
        *--*---*--
        *--*---*--
    Output
        Total areas found: 4
        Area #1 at (0, 1), size: 10
        Area #2 at (0, 8), size: 10
        Area #3 at (0, 4), size: 6
        Area #4 at (3, 4), size: 6
    
```

### Hints
  * Create a method to find the first traversable cell which hasn’t been visited. This would be the top-left corner of a connected area. If there is no such cell, this means all areas have been found.
  * You can create a class to hold info about a connected area (its position and size). Additionally, you can implement Comparable and store all areas found in a TreeSet.
