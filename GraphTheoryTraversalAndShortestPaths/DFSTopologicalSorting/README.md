# DFS Topological Sorting
1. DFS Algorithm
* The second algorithm we’ll use is DFS. You can comment on the method you just implemented and rewrite it to use the same unit tests.
  For this one, we’ll need a collection that will store all visited nodes:

The DFS topological sort is simple – loop through each node. We create a linked list for all sorted nodes because the DFS will find them in reverse order (we will add nodes in the beginning):
The DFS method shouldn’t do anything if the node is already visited; otherwise, it should mark the node as visited and add it to the list of sorted nodes. It should also do this for its children (if there are any):

Note that we add the node to the result after we traverse its children. This guarantees that the node will be added after the nodes that depend on it.
2. Test
* Run the unit tests. Once again, we have problems with cycles, in addition, there might be some test results that differ in terms of the order, think about it we do different traversal, so we can get a different correct answer.
3. Add Cycle Detection
* How do we know if a node forms a cycle? We can add it to a list of cycle nodes before traversing its children. If we enter a node with the same value, it will be in the cycleNodes collection, so we throw an exception. If there are no descendants with the same value then there are no cycles, so once we finish traversing the children we remove the current node from cycleNodes.
  Obviously, we’ll need a new collection to hold the cycle nodes, e.g. a Set<String>. Exiting the method with an exception is easy, just check if the current node is in the list of cycle nodes at the very beginning of the DFS method then, keep track of the cycle nodes:

  4. Test Cycle Detection
* Re-run the unit tests. This time they should all pass. You have implemented topological sorting using two different algorithms!