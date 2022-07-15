package GraphTheoryTraversalAndShortestPaths.ShortestPath;

import java.util.*;

public class Main {

    public static boolean[] visited;
    public static int[] prevNodes;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> graph = new ArrayList<>();


        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        int edges = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < edges; i++) {
            int[] paths = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            graph.get(paths[0]).add(paths[1]);
        }
        int source = Integer.parseInt(scanner.nextLine());
        int destination = Integer.parseInt(scanner.nextLine());

        visited = new boolean[n + 1];
        prevNodes = new int[n + 1];

        bfs(graph, source, destination);


    }

    private static void bfs(List<List<Integer>> graph, int source, int destination) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination) {
                return;
            }

            for (int child : graph.get(node)) {
                if(!visited[child]) {
                    visited[child] = true;
                    prevNodes[child] = node;
                    queue.offer(child);
                }

            }
        }
    }

    public static List<Deque<Integer>> getConnectedComponents(List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        List<Deque<Integer>> components = new ArrayList<>();

        for (int start = 0; start < graph.size(); start++) {
            if (!visited[start]) {
                components.add(new ArrayDeque<>());
                bfs(start, components, graph, visited);
            }
        }


        return components;
    }

    private static void bfs(int start, List<Deque<Integer>> components, List<List<Integer>> graph, boolean[] visited) {
        Deque<Integer> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            components.get(components.size() - 1).offer(node);

            for (int child : graph.get(node)) {
                if (!visited[child]) {
                    visited[child] = true;
                    queue.offer(child);
                }
            }
        }
    }

    private static void dfs(int node, List<Deque<Integer>> components, List<List<Integer>> graph, boolean[] visited) {

        if (!visited[node]) {
            visited[node] = true;
            for (int child : graph.get(node)) {
                dfs(child, components, graph, visited);
            }
            components.get(components.size() - 1).offer(node);
        }
    }

    public static Collection<String> topSort(Map<String, List<String>> graph) {
        Map<String, Integer> dependenciesCount = getDependenciesCound(graph);

        List<String> sorted = new ArrayList<>();

        while (!graph.isEmpty()) {
            String key = graph.keySet()
                    .stream()
                    .filter(k -> dependenciesCount.get(k) == 0)
                    .findFirst()
                    .orElse(null);
            if (key == null){
                break;
            }

            for (String child : graph.get(key)) {
                dependenciesCount.put(child,dependenciesCount.get(child) -1);
            }

            sorted.add(key);
            graph.remove(key);
        }

        if (!graph.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return sorted;
    }

    private static Map<String, Integer> getDependenciesCound(Map<String, List<String>> graph) {
        Map<String, Integer> dependenciesCount = new LinkedHashMap<>();

        for (Map.Entry<String, List<String>> node : graph.entrySet()) {
            dependenciesCount.putIfAbsent(node.getKey(), 0);
            for (String child : node.getValue()) {
                dependenciesCount.putIfAbsent(child, 0);
                dependenciesCount.put(child, dependenciesCount.get(child) + 1);
            }
        }

        return dependenciesCount;
    }
}
