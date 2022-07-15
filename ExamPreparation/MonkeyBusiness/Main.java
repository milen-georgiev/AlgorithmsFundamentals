package ExamPreparation.MonkeyBusiness;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int[] numbers;
    public static int solution = 0;
    public static int[] expression;
    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

         numbers = IntStream.rangeClosed(1, n).toArray();

         expression = new int[n];

        variations(0, n);

        System.out.println(output.toString().trim());
        System.out.println("Total Solutions: " + solution);
    }

    private static void variations(int index, int n) {
        if (index >= n) {
            printSolution();
            return;
        }

        expression[index] = numbers[index];
        variations(index + 1, n);

        expression[index] = -numbers[index];
        variations(index + 1, n);
    }

    private static void printSolution() {
        int sum = Arrays.stream(expression).sum();

        if (sum == 0) {
            solution++;
            for (int number : expression) {
                    String formatNumber = number > 0 ? "+" + number : String.valueOf(number);
                    output.append(formatNumber).append(" ");

            }
            output.append(System.lineSeparator());
        }
    }
}
