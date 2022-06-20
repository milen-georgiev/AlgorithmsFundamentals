package CombinatorialProblems.PermutationsWithoutRepetitions;


import java.util.Scanner;

public class Main {

    public static String[] input;
    public static String[] permutes;
    public static boolean[] used;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().split("\\s+");
        permutes = new String[input.length];
        used = new boolean[input.length];

        permute(0);
    }

    private static void permute(int index) {
        if (index == input.length) {
            print();
            return;
        }

        for (int i = 0; i < input.length; i++) {
            if (!used[i]) {
                used[i] = true;
                permutes[index] = input[i];
                permute(index + 1);
                used[i] = false;

            }
        }
    }

    private static void print() {
        System.out.println(String.join(" ", permutes));
    }

}