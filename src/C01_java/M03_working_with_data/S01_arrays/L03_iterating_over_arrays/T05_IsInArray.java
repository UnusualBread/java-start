package C01_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of integers and an integer.
The program must check if the array contains that number.
*/

import java.util.Scanner;

public class T05_IsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int numberToFind = sc.nextInt();

        boolean IsInArray = false;

        for (int number : arr) {
            if (number == numberToFind) {
                IsInArray = true;
                break;
            }
        }

        System.out.println(IsInArray);

        sc.close();
    }
}
