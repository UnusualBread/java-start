package C01_java.M02_code_organization.S02_methods.L06_declaring_methods;

/*
Here is the method named getNumberOfMaxParam that takes
three integer numbers and returns the position of the
first maximum in the order of the method parameters.
*/

import java.util.Scanner;

public class T02_MaxOfThreeNumbers {
    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        return a >= b && a >= c ? 1 : b >= a && b >= c ? 2 : 3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
