package C01_java.M02_code_organization.S02_methods.L04_functional_decomposition;

/*
In a template below you have a simple calculator that subtracts, sums, divides,
and multiplies the two numbers inside the switch statement. Now, we've decided
to upgrade it to perform more complex tasks, such as logarithmic functions.
For that, separate methods are a better solution. Let's start with decomposing
what we have.
*/

public class T02_SimpleCalculator {

    // Implement your methods here
    public static void subtractTwoNumbers (long n1 , long n2) {
        System.out.println(n1 - n2);
    }

    public static void sumTwoNumbers (long n1, long n2) {
        System.out.println(n1 + n2);
    }

    public static void divideTwoNumbers (long n1, long n2) {
        if (n2 == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(n1 / n2);
        }
    }

    public static void multiplyTwoNumbers (long n1, long n2) {
        System.out.println(n1 * n2);
    }
    // Implemented method
    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);
    }
}

class Main {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "^":
                T02_SimpleCalculator.power(num1, num2);
                break;
            case "+":
                T02_SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "-":
                T02_SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                T02_SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                T02_SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                break;
        }
    }
}
