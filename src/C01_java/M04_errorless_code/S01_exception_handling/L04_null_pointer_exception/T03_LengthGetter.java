package C01_java.M04_errorless_code.S01_exception_handling.L04_null_pointer_exception;

/*
Correct the code so it doesn't throw an exception.
*/

import java.util.Scanner;

public class T03_LengthGetter {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        if (name != null) {
            System.out.println(name.length());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printLength(str);

        sc.close();
    }
}