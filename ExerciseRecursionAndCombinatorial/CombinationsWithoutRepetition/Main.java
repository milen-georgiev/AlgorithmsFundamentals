package ExerciseRecursionAndCombinatorial.CombinationsWithoutRepetition;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int n;
    public static int[] arr;


    public static void main(String[] arg) throws IOException {
        Scanner scanner = new Scanner(System.in);

        n = Integer.parseInt(scanner.nextLine());

        int k = Integer.parseInt(scanner.nextLine());

        arr = new int[k];
        
        combinations(0, 1);

    }

    private static void combinations(int index, int start) {
        if (index == arr.length) {
            printArray();
        } else {
            for (int i = start; i <= n; i++) {
                arr[index] = i;
                combinations(index + 1, i + 1);
            }
        }
    }

    private static void printArray() {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
