package C01_java.M03_working_with_data.S01_arrays.L01_array;

/*
Create a program that analyzes temperature readings stored in an array.
The program should accept an integer 'n' for the number of readings,
then read 'n' float values as temperatures. Calculate and print the average
temperature, the highest temperature, and the count of readings above 30.0°C.
Format float outputs to one decimal place.
*/

import java.util.Scanner;

public class T05_Thermometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalReadings = sc.nextInt();

        int countAboveThirty = 0;
        float max = 0;
        float sum = 0;

        for (int i = 0; i < totalReadings; i++) {
            float celsius = sc.nextFloat();
            sum += celsius;

            if (celsius > max) {
                max = celsius;
            }

            if (celsius > 30) {
                countAboveThirty++;
            }
        }

        float average = sum / totalReadings;

        System.out.printf("Average: %.1f%n", average);
        System.out.printf("Highest: %.1f%n", max);
        System.out.printf("Above 30.0°C: %d%n", countAboveThirty);

        sc.close();
    }
}
