package C01_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that calculates the sum of the elements of an array of ints.
*/

import java.util.Scanner;

public class T07_SumOfArrayGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int number : arr) {
            sum += number;
        }

        System.out.println(sum);

        sc.close();
    }
}
