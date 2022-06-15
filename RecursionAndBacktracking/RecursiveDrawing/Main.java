package RecursionAndBacktracking.RecursiveDrawing;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        calculateFactorial(n);
    }

    private static void calculateFactorial(int n) {

        printFigure("*", n);
        if (n > 1) {
        calculateFactorial(n - 1);
        }
        printFigure("#", n);


    }

    private static void printFigure(String symbol, int step) {
        for (int i = 1; i <= step; i++) {
            System.out.print(symbol);
        }
        System.out.println();

    }
}
