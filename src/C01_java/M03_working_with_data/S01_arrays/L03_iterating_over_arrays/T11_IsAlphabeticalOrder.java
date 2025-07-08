package C01_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of lowercase strings and
checks whether the array is in alphabetical order or not.
*/

import java.util.Scanner;

public class T11_IsAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        boolean isAlphabetical = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                isAlphabetical = false;
                break;
            }
        }

        System.out.println(isAlphabetical);

        sc.close();
    }
}
