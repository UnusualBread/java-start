package C01_java.M01_basics.S05_control_flow_statements.L03_switch;

/*
Write a program that reads an integer between 1 and 7 from the user,
representing a day of the week.
*/

import java.util.Scanner;

public class T01_DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }

        sc.close();
    }
}
