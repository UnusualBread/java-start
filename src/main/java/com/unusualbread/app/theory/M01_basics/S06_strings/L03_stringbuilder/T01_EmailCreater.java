package com.unusualbread.app.theory.M01_basics.S06_strings.L03_stringbuilder;

/*
We need to create an email name for an employee. For this, implement a method
that takes a String name and a String surname as an argument. The method should
concatenate the name, the surname, and at the end, add the domain "@work.net".
Return the result. It's guaranteed that input strings will not be empty.
Use StringBuilder to solve the problem.
*/

import java.util.Scanner;

class EmployeeManagement {

    public static String createEmail(String name, String surname) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        return sb.append(name).append(surname).append("@work.net").toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        String completeEmail = createEmail(name, surname);

        System.out.println(completeEmail);
    }
}
