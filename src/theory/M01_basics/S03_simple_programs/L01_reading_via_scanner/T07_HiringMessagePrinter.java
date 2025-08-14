package theory.M01_basics.S03_simple_programs.L01_reading_via_scanner;

/*
Imagine that you are an HR manager at a restaurant, and you need to hire a chef.
To do that, you need to collect some preliminary data about the candidates.

You have a special form for the candidates that includes 3 fields: first name,
years of experience and cuisine preference.

Your program should read all the words (or numbers) from the three lines and
output "The form for first name is completed. We will contact you if we need a
chef who cooks cuisine preference dishes and has years of experience years of
experience."
*/

import java.util.Scanner;

public class T07_HiringMessagePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String cuisinePreference = sc.nextLine();
        int yearsOfExperience = sc.nextInt();

        System.out.printf("The form for %s is completed. We will contact you if we need a chef who cooks %s dishes and has %d years of experience.", name, cuisinePreference, yearsOfExperience);

        sc.close();
    }
}
