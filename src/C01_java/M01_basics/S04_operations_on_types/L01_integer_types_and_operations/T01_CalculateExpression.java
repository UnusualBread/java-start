package C01_java.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

import java.util.Scanner;

public class T01_CalculateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = sc.next();
        String surname = sc.next();

        System.out.println(n + " " + name + " " + surname);
        //System.out.println(name);


        sc.close();
    }
}
