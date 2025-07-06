package C01_java.M02_code_organization.S02_methods.L04_functional_decomposition;

/*
Design a basic traffic light controller. Create methods to handle different
light states (red, yellow, green) and cycle through them. The main method
should simulate the traffic light cycle. Input is the current state (0 for red,
1 for yellow, 2 for green), and output is the next state and action.
*/

import java.util.Scanner;

public class T06_TrafficLightController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);

        scanner.close();
    }

    public static String getNextState(int currentState) {
        return currentState == 0 ? "1" : currentState == 1 ? "2" : "0";
    }

    public static String getAction(int currentState) {
        return currentState == 0 ? "Change to Yellow" : currentState == 1 ? "Change to Green" : "Change to Red";
    }
}
