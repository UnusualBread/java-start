package C01_java.M01_basics.S05_control_flow_statements.L01_break_and_continue;

/*
The first line of the input contains the height of the bus and the number of
bridges under which the bus passes. The second line contains the heights of
these bridges.
You should output "Will not crash" if everything will be alright; otherwise,
output "Will crash on bridge i" (where i is the number of the bridge) into
which the bus will crash. If the height of a bridge equals the height of the
bus, the bus will crash.
*/

import java.util.Scanner;

public class T07_HeightOfBusChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int bridgesNumber = sc.nextInt();
        int numberOfLowBridge = 0;

        for (int i = 1; i <= bridgesNumber; i++) {
            int bridgeHeight = sc.nextInt();

            if (numberOfLowBridge != 0) {
                continue;
            }

            if (busHeight >= bridgeHeight) {
                numberOfLowBridge = i;
            }
        }

        if (numberOfLowBridge != 0) {
            System.out.println("Will crash on bridge " + numberOfLowBridge);
        } else {
            System.out.println("Will not crash");
        }

        sc.close();
    }
}
