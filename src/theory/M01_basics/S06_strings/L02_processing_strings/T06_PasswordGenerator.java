package theory.M01_basics.S06_strings.L02_processing_strings;

/*
A password is hard to crack if it contains at least A uppercase letters, at
least B lowercase letters, at least C digits and consists of exactly N symbols.
Also, a password cannot contain two or more of the same characters in a row.
For the given numbers A, B, C, and N, you should output a password that matches
these requirements.
*/

import java.util.Scanner;

public class T06_PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uppercaseValue = sc.nextInt();
        int lowercaseValue = sc.nextInt();
        int digitsValue = sc.nextInt();
        int totalValue = sc.nextInt();
        sc.close();

        if (totalValue == 0) {
            return;
        }

        String password = "";

        for (int i = 0; i < uppercaseValue; i++) {
            if (i % 2 == 0) {
                password += 'A';
            } else {
                password += 'B';
            }
        }

        for (int i = 0; i < lowercaseValue; i++) {
            if (i % 2 == 0) {
                password += 'a';
            } else {
                password += 'b';
            }
        }

        for (int i = 0; i < digitsValue; i++) {
            if (i % 2 == 0) {
                password += '1';
            } else {
                password += '2';
            }
        }

        int remainingValue = totalValue - uppercaseValue - lowercaseValue - digitsValue;

        if (password.isEmpty() || password.charAt(password.length() - 1) != 'A') {
            for (int i = 0; i < remainingValue; i++) {
                if (i % 2 == 0) {
                    password += 'A';
                } else {
                    password += 'B';
                }
            }
        } else {
            for (int i = 0; i < remainingValue; i++) {
                if (i % 2 == 1) {
                    password += 'A';
                } else {
                    password += 'B';
                }
            }
        }

        System.out.println(password);
    }
}
