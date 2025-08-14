package theory.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program that reads a string and then output another string with doubled
characters.
*/

import java.util.Scanner;

class T01_CharsDuplicator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String doubledStr = "";

        for (int i = 0; i < str.length(); i++) {
            doubledStr += "" + str.charAt(i) + str.charAt(i);
        }

        System.out.println(doubledStr);
    }
}
