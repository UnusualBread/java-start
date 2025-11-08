package theory.M04_errorless_code.S01_exception_handling.L06_throwing_exceptions;

import java.util.Scanner;

public class T05_RootCalculator {

    public static double sqrt(double x) {
        if (x < 0) throw new IllegalArgumentException("Expected non-negative number, got %s".formatted(x));
        return Math.sqrt(x);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        String value = new Scanner(System.in).nextLine();
        try {
            double res = sqrt(Double.parseDouble(value));
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
