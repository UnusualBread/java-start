package C01_java.M01_basics.S03_simple_programs.L01_reading_via_scanner;

import java.util.Scanner;

/*Write a program that reads two integers from the user using Scanner,
calculates their sum, and prints the result. The first input represents
the number of apples, and the second input represents the number of oranges.
The output should display the total number of fruits.
 */

public class T02_SumIntegers {
    public static void main(String[] args) {
        // Use a Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read the number of apples from the user
        int numApples = sc.nextInt();

        // Read the number of oranges from the user
        int numOranges = sc.nextInt();

        // Calculate the total number of fruits and print the result
        System.out.print(numApples + numOranges);
    }
}
