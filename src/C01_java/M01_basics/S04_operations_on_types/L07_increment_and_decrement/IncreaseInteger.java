package C01_java.M01_basics.S04_operations_on_types.L07_increment_and_decrement;

import java.util.Scanner;

/*
Write a Java program that reads a single integer from the input
and increases it by 1, and then decreases it by 2, and finally
increases it by 3. The final computed integer should be printed
as the output.
*/

public class IncreaseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        number++;
        number--;
        number--;
        number++;
        number++;

        System.out.print(++number);
    }
}
