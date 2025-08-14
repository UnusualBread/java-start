package theory.M01_basics.S03_simple_programs.L01_reading_via_scanner;

/*
There is a hotel that may accommodate 4 guests. Each line of the input contains
the name or the names of the guests arriving at the hotel on a certain day.

Read the names of the guests from the input and output each name on a separate
line and in reverse order starting with the last arrived guest. Note that the
order of the arriving guests and the number of days are not pre-defined.
*/

import java.util.Scanner;

public class T08_LinesReverser_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String secondName = sc.next();
        String thirdName = sc.next();
        String fourthName = sc.next();

        System.out.println(fourthName);
        System.out.println(thirdName);
        System.out.println(secondName);
        System.out.println(firstName);

        sc.close();
    }
}