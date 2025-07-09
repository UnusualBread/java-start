package C01_java.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an unsorted array of integers and
two numbers n and m. The program must check if n and m occur
next to each other in the array (in any order).
*/

import java.util.Scanner;

public class T04_AreNeighboursChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        boolean areNeighbours = false;

        for (int i = 0; i < totalNumbers - 1; i++) {
            if (arr[i] == firstNumber && arr[i + 1] == secondNumber || arr[i] == secondNumber && arr[i + 1] == firstNumber) {
                areNeighbours = true;
                break;
            }
        }

        System.out.println(areNeighbours);

        sc.close();
    }
}
