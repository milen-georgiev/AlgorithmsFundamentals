# Source Removal Topological Sorting
We’re given a directed graph which means that if node A is connected to node B and the vertex is directed from A to B, we can move from A to B, but not the other way around, i.e. we have a one-way street. We’ll call A "source" or "predecessor" and B – "child".
Let’s consider the tasks a SoftUni student needs to perform during an exam – "Read description", "Receive input", "Print output", etc.
Some of the tasks depend on other tasks – we cannot print the output of a problem before we get the input. If all such tasks are nodes in a graph, a directed vertex will represent dependency between two tasks, e.g. if A -> B (A is connected to B and the direction is from A to B), this means B cannot be performed before completing A first. Having all tasks as nodes and the relationships between them as vertices, we can order the tasks using topological sorting.
After the sorting procedure, we’ll obtain a list showing all tasks in the order in which they should be performed. Of course, there may be more than one such order, and there usually is, but in general, the tasks which are less dependent on other tasks will appear first in the resulting list.
For this problem, you need to implement topological sorting over a directed graph of strings.
Example
Input
Picture
Output
"A" -> "B", "C"
"B" -> "D", "E"
"C" -> "F"
"D" -> "C", "F"
"E" -> "D"
"F" ->

Topological sorting:
A, B, E, D, C, F
"IDEs" -> "variables", "loops"
"variables" -> "conditionals", "loops", "bits"
"conditionals" -> "loops"
"loops" -> "bits"
"bits"

Topological sorting:
IDEs, variables, conditionals, loops, bits
"5" -> "11"
"7" -> "11", "8"
"8" -> "9"
"11" -> "9", "10", "2"
"9" ->
"3" -> "8", "10"
"2" ->
"10"

Topological sorting: 3, 7, 8, 5, 11, 2, 10, 9
We’ll solve this using two different algorithms – source removal and DFS.
1. Source Removal Algorithm
The source removal algorithm is pretty simple – it finds the node which isn’t dependent on any other node and removes it along with all vertices connected to it.
We continue removing each node recursively until we’re done and all nodes have been removed. If there are nodes in the graph after the algorithm is complete, there are circular dependencies (we will throw an exception).
2. Compute Predecessors
To efficiently remove a node at each step, we need to know the number of predecessors for each node. To do this, we will calculate the number of predecessors beforehand.
Create a map to store the predecessor count for each node:

Compute the predecessor count for each node:

    3. Remove Independent Nodes
Now that we know how many predecessors each node has, we just need to:
1. Find a node without predecessors and remove it
2. Repeat until we’re done
We’ll keep the result in a list and start a loop that will stop when there is no independent node:

Finding a source can be simplified with Stream API. We just need to check if such a node exists; if not, we break the loop:

Removing a node involves several steps:
1. All its child nodes lose a predecessor -> decrement the count of predecessors for each of the children
2. Remove the node from the graph
3. Add the node to the list of removed nodes

Finally, return the list of removed nodes.
4. Test
Run the unit tests. It seems we have a problem:

The last unit tests include graphs with cycles in them. We need to modify our algorithm to take care of cycles.
5. Detect Cycles
If we ended the loop and the graph still has nodes, this means there is a cycle. Just add a check after the while loop and throw the proper exception if the graph is not empty:

    6. Test Cycle Detection
Run the unit tests again. This time they should pass: