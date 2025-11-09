package theory.M01_basics.S05_control_flow_statements.L07_switch_expression;

/*
Rewrite the following switch statement as a switch expression using the code
template below.
*/

import java.util.Scanner;

enum Seasons { SPRING, SUMMER, AUTUMN, WINTER }

public class T01_SeasonTemperaturePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Seasons season = Seasons.valueOf(scanner.nextLine());

        int temperature = switch (season) {
            case SPRING, AUTUMN -> 20;
            case SUMMER -> 37;
            case WINTER -> 1;
        };

        System.out.println(temperature);
    }
}
