package C01_java.M01_basics.S04_operations_on_types.L06_arithmetics;

public class T01_ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(13 + 25); // prints 38
        System.out.println(20 + 70); // prints 90

        System.out.println(70 - 30); // prints 40
        System.out.println(30 - 70); // prints -40

        System.out.println(21 * 3);  // prints 63
        System.out.println(20 * 10); // prints 200

        System.out.println(8 / 3); // prints 2
        System.out.println(41 / 5); // prints 8

        System.out.println(10 % 3); // prints 1, because 10 divided by 3 leaves a remainder of 1
        System.out.println(12 % 4); // prints 0, because 12 divided by 4 leaves no remainder
        System.out.println(5 % 9); // prints 5, because 5 divided by 9 leaves a remainder of 5

        System.out.println(1 + 3 * 4 - 2); // prints 11

        System.out.println((1 + 3) * (4 - 2)); // prints 8

        System.out.println(+5); // prints 5

        System.out.println(-8);  // prints -8
        System.out.println(-(100 + 4)); // prints -104
    }
}
