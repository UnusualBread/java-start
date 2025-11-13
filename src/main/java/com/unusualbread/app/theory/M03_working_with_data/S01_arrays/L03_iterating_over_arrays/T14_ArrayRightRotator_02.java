package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of ints named a and cyclically shift the
elements of the array to the right: a[0] goes to the place of a[1], a[1] goes
to the place of a[2], ..., and the last element goes to the place of a[0].
*/

import java.util.Scanner;

public class T14_ArrayRightRotator_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int[] buffer = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            buffer[i] = arr[(totalNumbers - 1 + i) % totalNumbers];
        }

        for (int i = 0; i < totalNumbers; i++) {
            System.out.print(buffer[i] + " ");
        }

        sc.close();
    }
}
