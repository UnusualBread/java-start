package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of ints and an integer number n.
The program must sum all the array elements greater than n.
*/

import java.util.Scanner;

public class T08_SumOfArrayGetter_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int threshold = sc.nextInt();
        int sum = 0;

        for (int number : arr) {
            if (number > threshold) {
                sum += number;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
