package theory.M04_errorless_code.S01_exception_handling.L03_exception_handling;

/*
Your task is to write a program that reads a sequence of strings and converts
them to integer numbers, multiplying by 10. Some input strings may have an
invalid format, for instance: "abc". The sequence length may be different. Its
ending is indicated by “0”. Zero serves as a stop character and should not be
included in the sequence.

If a string can be converted to an integer number, output the number multiplied
by 10. Otherwise, output the string "Invalid user input: X" where X is the
input string. To better understand the scenario, see the examples below.
*/

import java.util.Scanner;

public class T03_Multiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        while (!"0".equals(number)) {
            try {
                System.out.println(Integer.parseInt(number) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + number);
            }

            number = sc.nextLine();
        }

        sc.close();
    }
}
