package C01_java.M01_basics.S02_data_types_and_variables.L06_primitive_and_reference_types;

/*
One of the most popular reference types is String. Your task is to create a
String variable, assign the value Hello, learner! to it, and print it to the
console.
*/

import java.util.Scanner;

public class T01_TextPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello, learner!";

        System.out.println(str);

        sc.close();
    }
}
