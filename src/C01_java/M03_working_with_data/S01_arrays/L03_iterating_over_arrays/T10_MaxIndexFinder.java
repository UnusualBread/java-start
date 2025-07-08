package C01_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of ints and finds
the index of the first maximum in that array.
*/

import java.util.Scanner;

public class T10_MaxIndexFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE, ind = 0;

        for (int i = 0; i < totalNumbers; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ind = i;
            }
        }

        System.out.println(ind);

        sc.close();
    }
}
