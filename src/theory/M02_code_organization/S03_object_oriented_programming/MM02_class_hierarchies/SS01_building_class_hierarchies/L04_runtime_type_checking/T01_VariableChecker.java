package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L04_runtime_type_checking;

/*
Update the code using the new pattern matching features.
*/

import java.util.Scanner;

public class T01_VariableChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object msg = scanner.nextLine();

        if (msg instanceof String str) {

            if (str.length() > 0) {
                System.out.printf("The variable is not empty, the length is %d", str.length());
            }
        }
    }
}
