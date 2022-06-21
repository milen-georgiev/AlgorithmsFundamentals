package CombinatorialProblems.CombinationsWithRepetition;

import java.util.Scanner;

public class Main {

    public static String[] input;
    public static String[] variations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());

        variations = new String[k];

        combinations(0, 0);
    }

    private static void combinations(int index, int start) {
        if (index == variations.length) {
            print(variations);
        } else {
            for (int i = start; i < input.length; i++) {
                variations[index] = input[i];
                combinations(index + 1, i);
            }
        }

    }

    private static void print(String[] input) {
        System.out.println(String.join(" ", input));
    }

}