package C02_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of integers and two numbers n and m.
The program must check that n and m never occur next to each other
(in any order) in the array.
*/

import java.util.Scanner;

public class T01_AreNeverNeighboursChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        boolean areNeverNeighbours = true;

        for (int i = 0; i < totalNumbers - 1; i++) {
            if (arr[i] == firstNumber && arr[i + 1] == secondNumber || arr[i] == secondNumber && arr[i + 1] == firstNumber) {
                areNeverNeighbours = false;
                break;
            }
        }

        System.out.println(areNeverNeighbours);

        sc.close();
    }
}
