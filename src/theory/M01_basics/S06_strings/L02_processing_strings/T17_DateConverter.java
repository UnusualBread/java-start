package theory.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program that takes a date string formatted as YYYY-MM-DD as input, then
converts and outputs it as MM/DD/YYYY.
*/

import java.util.Scanner;

public class T17_DateConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String[] strArr = str.split("-");

        System.out.printf("%s/%s/%s", strArr[1], strArr[2], strArr[0]);
    }
}
