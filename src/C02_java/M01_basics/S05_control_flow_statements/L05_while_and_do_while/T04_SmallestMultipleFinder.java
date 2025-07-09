package C02_java.M01_basics.S05_control_flow_statements.L05_while_and_do_while;

/*
Given a positive integer 'n', print the smallest number 'x' that is greater
than or equal to 'n' which is a multiple of 3. Use a while loop to generate
a sequence of natural numbers, starting from 'n', and then find the smallest
number in this sequence that is a multiple of 3. Use the modulus (%) operator
to check for a multiple of 3, if 'x' modulo 3 equals 0 then 'x' is a multiple
of 3. Print -1 if 'n' is not a positive integer.
*/

import java.util.Scanner;

public class T04_SmallestMultipleFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("-1");
        } else {
            while (true) {
                if (number % 3 == 0) {
                    System.out.println(number);
                    break;
                }

                number++;
            }
        }

        sc.close();
    }
}
