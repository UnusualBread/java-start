package C01_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of integers and
finds the minimum value of the array.
*/

import java.util.Scanner;

public class T09_MinValueOfArrayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println(min);
        
        sc.close();
    }
}
