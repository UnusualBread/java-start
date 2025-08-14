package theory.M01_basics.S04_operations_on_types.L06_arithmetic_operations;

/*
Calculate the average speed of a car trip given the distance traveled
and the time taken. Scan the distance in kilometers and the time in
hours from the user input. Print the average speed rounded to 2 decimal
places in kilometers per hour.
*/

import java.util.Scanner;

public class T01_SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the distance traveled in kilometers
        double distance = scanner.nextDouble();

        // Read the time taken in hours
        double time = scanner.nextDouble();

        // TODO: Calculate the average speed in kilometers per hour
        double averageSpeed = distance / time;

        // Print the average speed rounded to 2 decimal places
        System.out.printf("%.2f", averageSpeed);
    }
}
