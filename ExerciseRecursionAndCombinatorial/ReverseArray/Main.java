package ExerciseRecursionAndCombinatorial.ReverseArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] element = reader.readLine().split("\\s+");

        for (int i = element.length - 1; i >= 0; i--) {

        }

        printReversedArray(element, element.length - 1);
    }

    private static void printReversedArray(String[] element, int index) {

        if (index < 0) {
            return;
        }

        System.out.print(element[index] + " ");
        printReversedArray(element, index - 1);
    }
}
