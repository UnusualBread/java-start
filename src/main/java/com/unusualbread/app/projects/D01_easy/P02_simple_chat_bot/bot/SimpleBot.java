package com.unusualbread.app.projects.D01_easy.P02_simple_chat_bot.bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        String botName = "Lex";
        int birthYear = 2025;

        System.out.printf("Hello! My name is %s.\n", botName);
        System.out.printf("I was created in %d.\n", birthYear);
        System.out.println("Please, remind me your name.");

        Scanner sc = new Scanner(System.in);
        String yourName = sc.nextLine();

        System.out.printf("What a great name you have, %s!\n", yourName);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = sc.nextInt();
        int remainder5 = sc.nextInt();
        int remainder7 = sc.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int number = sc.nextInt();

        for (int i = 0; i < number + 1; i++) {
            System.out.printf("%d!\n", i);
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("What programming language am I written in?");
        System.out.println("1. Java.");
        System.out.println("2. Python.");
        System.out.println("3. C.");
        System.out.println("4. Pascal.");

        boolean isCorrect = false;
        int answer = 0;

        while (!isCorrect) {
            try {
                answer = sc.nextInt();

                switch (answer) {
                    case 1 -> {
                        isCorrect = true;
                        System.out.println("Congratulations, have a nice day!");
                    }

                    case 2, 3, 4 -> System.out.println("Please, try again.");
                    default -> throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                System.out.println("Please, enter only a number from 1 to 4.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}