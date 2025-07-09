package C02_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of ints and outputs the maximum product
of two adjacent elements in the given array of non-negative numbers.
*/

import java.util.Scanner;

public class T03_NeighboursMaxProductFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumber = sc.nextInt();
        int max = 0;
        int[] arr = new int[totalNumber];
        arr[0] = sc.nextInt();

        for (int i = 1; i < totalNumber; i++) {
            arr[i] = sc.nextInt();
            int product = arr[i - 1] * arr[i];

            if (product > max) {
                max = product;
            }
        }

        System.out.println(max);

        sc.close();
    }
}
