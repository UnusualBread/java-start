package com.unusualbread.app.theory.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

/*
Find how many seconds passed between the two moments of time on the same day.

Input data format:
The program gets the input of six integers: three defining the first moment of time in hours,
minutes, seconds, and the other three defining the second one.

Output data format
Just one number: seconds between these two moments of time.
*/

import java.util.Scanner;

public class T11_TimeDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int earlierHours = sc.nextInt();
        int earlierMinutes = sc.nextInt();
        int earlierSeconds = sc.nextInt();
        int laterHours = sc.nextInt();
        int laterMinutes = sc.nextInt();
        int laterSeconds = sc.nextInt();

        int earlierTotalSeconds = earlierHours * 3600 + earlierMinutes * 60 + earlierSeconds;
        int laterTotalSeconds = laterHours * 3600 + laterMinutes * 60 + laterSeconds;

        int timeDifference = laterTotalSeconds - earlierTotalSeconds;

        System.out.println(timeDifference);

        sc.close();
    }
}
