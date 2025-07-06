package C01_java.M02_code_organization.S02_methods.L04_functional_decomposition;

/*
Write a Java program that takes an integer as an input. If the number is
divisible by 3, it should print 'Fizz', and if it's divisible by 5, it should
print 'Buzz'. If it's divisible by both 3 and 5, print 'FizzBuzz'. For any
other integer, just print 'None'. You need to create separate methods to check
divisibility by 3, 5 and both.
*/

import java.util.Scanner;

public class T05_DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        if (isDivByThreeAndFive(num)) {
            System.out.println("FizzBuzz");
        } else if (isDivByThree(num)) {
            System.out.println("Fizz");
        } else if (isDivByFive(num)) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }

        scanner.close();
    }
    // function isDivByThree will be here
    public static boolean isDivByThree(int a) {
        return a % 3 == 0;
    }

    // function isDivByFive will be here
    public static boolean isDivByFive(int a) {
        return a % 5 == 0;
    }

    // function isDivByThreeAndFive will be here
    public static boolean isDivByThreeAndFive(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }
}
