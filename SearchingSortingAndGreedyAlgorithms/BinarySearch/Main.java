package SearchingSortingAndGreedyAlgorithms.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int find = Integer.parseInt(scanner.nextLine());

        System.out.println(indexOf(arr, find));
    }

    private static int indexOf(int[] arr, int find) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int current = arr[mid];
            if (find < current) {
                end = mid - 1;
            } else if (find > current) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
