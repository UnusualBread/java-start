package theory.M02_code_organization.S02_methods.L05_calling_methods;

/*
Here's the method callMeAwesome. Write the
invocation of this method in the template below.
*/

import java.util.Scanner;

public class T02_ComplimentGiver {

    public static void main(String[] args) {
        // call the method here
        callMeAwesome();
    }

    // Do not change code below
    public static void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}
