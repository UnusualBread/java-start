package theory.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of int's and checks if the
array is sorted ascending (from smallest to largest number).
*/

import java.util.Scanner;

public class T12_IsAscendingOrderChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < totalNumbers - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        System.out.println(isAscending);

        sc.close();
    }
}
