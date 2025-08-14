package theory.M01_basics.S05_control_flow_statements.L04_for_loop;

import java.util.Scanner;

/*
Find the number of D, C, B and A grades for the last test on informatics,
where n students from a class have successfully passed the test.
The program gets number n as the first line of input. This means there will
be n number of grades. Then the program gets the grades themselves,
each on a new line.
Create a program to count the occurrence of each grade and output four numbers
in a single line: the number of D, C, B, and A grades (in that order),
separated by blank space characters.
*/

public class T03_GradesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        scanner.nextLine();
        for (int i = 0; i < numberOfStudents; i++) {
            String grade = scanner.nextLine();

            countA = grade.equals("A") ? ++countA : countA;
            countB = grade.equals("B") ? ++countB : countB;
            countC = grade.equals("C") ? ++countC : countC;
            countD = grade.equals("D") ? ++countD : countD;
        }

        System.out.println(countD + " " + countC + " " + countB + " " + countA);

        scanner.close();
    }
}
