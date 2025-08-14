package theory.M02_code_organization.S02_methods.L03_arrays_as_parameters;

/*
Implement a method for sorting a given array of integers in ascending order.
You can use any algorithm for sorting it.
*/

import java.util.Arrays;
import java.util.Scanner;

public class T04_IntArraySorter {

    public static void sort(int[] numbers) {
        // write your code here
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
