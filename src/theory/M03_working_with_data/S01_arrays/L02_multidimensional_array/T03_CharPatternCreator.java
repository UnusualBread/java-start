package theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
In Java, create a program that accepts an integer n as input representing the
number of rows and columns in a square matrix, and prints a formatted string of
a diagonally striped pattern over the array. This should be done by marking
cells with a '#' if their row index and column index are the same or add
together to n-1, and with a space ' ' otherwise. A newline should follow each
row of the array.
*/

import java.util.Scanner;

public class T03_CharPatternCreator {
    public static void printPattern(int size) {
        char[][] arr = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    arr[i][j] = '#';
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        for (char[] row : arr) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
}
