package C02_java.M01_basics.S02_data_types_and_variables.L03_floating_point_types;

import java.util.Scanner;

/*
Write a program that reads the distance between two cities in miles
and the travel time by bus in hours and outputs the average speed of the bus.
*/

public class T02_CalculateSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextInt();
        double time = scanner.nextInt();

        double speed = distance / time;

        System.out.println(speed);

        scanner.close();
    }
}
