package C02_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Implement rotate method that performs a right
rotation on an array by a given number.
*/

import java.util.Arrays;
import java.util.Scanner;

public class T02_ArrayRightRotator_01 {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int len = arr.length;
        int[] buffer = new int[len];

        for (int i = 0; i < len; i++) {
            buffer[(i + steps) % len] = arr[i];
        }

        for (int i = 0; i < len; i++) {
            arr[i] = buffer[i];
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
