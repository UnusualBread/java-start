package C02_java.M01_basics.S05_control_flow_statements.L02_conditional_statement;

import java.util.Scanner;

/*
Given three natural numbers A, B, and C.
Determine if a triangle with these sides can exist.
If the triangle exists, output the "YES" string;
otherwise, output "NO".
*/

public class T02_TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aSide = scanner.nextInt();
        int bSide = scanner.nextInt();
        int cSide = scanner.nextInt();

        if (aSide + bSide > cSide && aSide + cSide > bSide && bSide + cSide > aSide) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
