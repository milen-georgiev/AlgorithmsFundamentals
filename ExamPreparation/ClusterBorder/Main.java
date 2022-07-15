package ExamPreparation.ClusterBorder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] singleTimes = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] combinationTimes = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] memory = new int[singleTimes.length + 1];

        memory[0] = 0;
        memory[1] = singleTimes[0];

        for (int i = 2; i <= singleTimes.length; i++) {
            int singleShip = memory[i - 1] + singleTimes[i - 1];
            int pairShip = memory[i - 2] + combinationTimes[i - 2];
            memory[i] = Math.min(singleShip, pairShip);
        }

        System.out.println("Optimal Time: " + memory[memory.length - 1]);

        int index = memory.length - 1;

        List<String> outputLines = new ArrayList<>();

        while (index > 0) {
            String outputLine;
            if (memory[index - 1] + singleTimes[index - 1] == memory[index]) {
                outputLine = "Single " + index;
                index--;
            } else {
                outputLine = "Pair of " + (index - 1) + " and " + index;
                index -= 2;
            }

            outputLines.add(outputLine);
        }

        Collections.reverse(outputLines);

        System.out.println(String.join(System.lineSeparator(), outputLines));
    }
}