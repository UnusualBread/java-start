package C02_java.M01_basics.S03_simple_programs.L01_reading_via_scanner;

import java.util.Scanner;

/*
Write a program that reads three strings from input and
prints them in the reverse order, each on a new line.
*/

public class T04_LinesReverser_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();
        String thirdLine = sc.nextLine();

        System.out.println(thirdLine);
        System.out.println(secondLine);
        System.out.println(firstLine);

        sc.close();
    }
}
