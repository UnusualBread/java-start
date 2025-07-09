package C02_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of ints and an integer number n.
The program must check how many times n occurs in the array.
*/

import java.util.Scanner;

public class T06_ArrayValueCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int numberToFind = sc.nextInt();

        int count = 0;

        for (int number : arr) {
            if (number == numberToFind) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
