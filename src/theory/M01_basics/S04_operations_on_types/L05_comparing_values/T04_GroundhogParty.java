package theory.M01_basics.S04_operations_on_types.L05_comparing_values;

import java.util.Scanner;

/*
Groundhogs like to throw fun parties, and at their parties, they like to eat
Reese's peanut butter cups. But not too many of them, or they feel sick!
A successful groundhog party will have between 10 and 20 Reese's peanut
butter cups, inclusive, unless it is the weekend, in which case they will
need 15 to 25 Reese's peanut butter cups, inclusive.
*/

public class T04_GroundhogParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cupsValue = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isSuccessful = cupsValue >= 10 && cupsValue <= 20 && !isWeekend || cupsValue >= 15 && cupsValue <= 25 && isWeekend;
        System.out.println(isSuccessful);

        scanner.close();
    }
}
