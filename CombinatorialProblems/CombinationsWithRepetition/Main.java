package CombinatorialProblems.CombinationsWithRepetition;

import java.util.Scanner;

public class Main {

    public static String[] input;
    public static String[] variations;
    public static boolean[] used;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());

        variations = new String[k];

        used = new boolean[input.length];

        variation(0);
    }

    private static void variation(int index) {
        if (index == variations.length) {
            print(variations);
            return;
        }

        for (int i = 0; i < input.length; i++) {
            variations[index] = input[i];
            variation(index + 1);
        }

    }

    private static void swap(String[] input, int first, int second) {
        String temp = input[first];
        input[first] = input[second];
        input[second] = temp;
    }

    private static void print(String[] input) {
        System.out.println(String.join(" ", input));
    }

}