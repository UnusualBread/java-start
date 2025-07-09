package C02_java.M01_basics.S05_control_flow_statements.L02_conditional_statement;

/*
Write a program that will classify the army of your enemies
corresponding to the following rules:
Units: Category
less than 1: no army
from 1 to 19: pack
from 20 to 249: throng
from 250 to 999: zounds
1000 and more: legion
The program should read the number of units
and output the corresponding category.
*/

import java.util.Scanner;

public class T09_ArmyClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfUnits = sc.nextInt();

        if (numberOfUnits < 1) {
            System.out.println("no army");
        } else if (numberOfUnits < 20) {
            System.out.println("pack");
        } else if (numberOfUnits < 250) {
            System.out.println("throng");
        } else if (numberOfUnits < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }

        sc.close();
    }
}
