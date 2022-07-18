package ExerciseGraphTheoryTraversalAndShortestPaths.CyclesInAGraph;

import java.util.*;

public class Main {

    public static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String source = null;

        while (!line.equals("End")) {
            String[] token = line.split("-");

            if (source == null) {
                source = token[0];
            }

            graph.putIfAbsent(token[0], new ArrayList<>());
            graph.get(token[0]).add(token[1]);

            line = scanner.nextLine();
        }

        Set<String> visited = new HashSet<>();
        Set<String> cycles = new HashSet<>();

        try {
            dfs(source, visited, cycles);
            System.out.println("Acyclic: Yes");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void dfs(String source, Set<String> visited, Set<String> cycles) {
        if (cycles.contains(source)) {
            throw new IllegalArgumentException("Acyclic: No");
        }

        if (visited.contains(source)) {
            return;
        }

        cycles.add(source);
        visited.add(source);

        List<String> children = graph.get(source);

        if (children == null) {
            return;
        }

        for (String child : children) {
            dfs(child, visited, cycles);
        }
        cycles.remove(source);
    }
}
