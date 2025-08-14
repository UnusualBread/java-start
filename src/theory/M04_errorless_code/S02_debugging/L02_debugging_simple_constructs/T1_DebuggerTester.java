package theory.M04_errorless_code.S02_debugging.L02_debugging_simple_constructs;

public class T1_DebuggerTester {
/*    public static void main(String[] args) {
        fibonacci();
    }

    static void fibonacci() {
        int prev = 0;
        int current = 1;
        for (int i = 0; i <= 25; i++) {
            int swap = prev;
            prev = current;
            current += swap;
            System.out.println(current);
        }
    }*/

/*    public static void main(String[] args) {
        int number1 = 38;
        int number2 = 54;

        number1 = number1 << 2;
        number2 = number2 >> 1;
        int result = number2 ^ number1;
    }*/

/*    public static void main(String[] args) {
        int fibonacciPrevious = 1;
        int fibonacciCurrent = 1;
        int fibonacciSum = fibonacciPrevious + fibonacciCurrent;

        while (true) {
            int tmp = fibonacciPrevious + fibonacciCurrent;
            fibonacciPrevious = fibonacciCurrent;
            fibonacciCurrent = tmp;
            fibonacciSum += fibonacciCurrent;
        }
    }*/

/*    public static void main(String[] args) {
        System.out.println(modifyString("my password is 12345"));
    }

    static String modifyString(String initialString) {
        String modString = initialString;

        modString = modString.substring(0, 2) + modString.substring(10); // 1
        if (modString.contains(" ")) { // 2
            modString += "ABC";
        }
        int space = modString.indexOf(" ");
        modString = modString.substring(space + 1) + modString.substring(0, space); // 3
        if (modString.contains("a")) { // 4
            modString += "1248";
        }
        modString = modString.replaceFirst("\\s", "\\$"); // 5
        if (modString.length() < 15) { // 6
            modString = new StringBuilder(modString).reverse().toString();
        }
        modString += "18B20"; // 7
        int one = modString.indexOf("1");
        int five = modString.indexOf("5");
        modString = modString.substring(one + 1) + modString.substring(0, five); // 8
        modString.substring(0, modString.length() - 4); // 9

        return modString;
    }*/

/*    public static void main(String[] args) {
        int greatestPrimeInRange = 2;
        for (int number = 2; number <= 1000; number++) {
            if (isPrime(number) && number > greatestPrimeInRange) {
                greatestPrimeInRange = number;
            }
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i != 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }*/

/*    public static void main(String[] args) {
        boolean result = isPrime(5977);
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i != 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }*/

/*    public static void main(String[] args) {
        int condition1 = 175892;
        int condition2 = 98795;

        if ((condition1 & condition2) > 35925) {
            printXor(condition1 - condition2, condition1 | condition2); // 1
        } else {
            printXor(condition1 ^ condition2, condition1 & condition2); // 2
        }
    }

    static void printXor(int condition1, int condition2) {
        System.out.println(condition1 ^ condition2);
    }*/
}
