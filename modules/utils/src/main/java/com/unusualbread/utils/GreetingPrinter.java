package com.unusualbread.utils;

public class GreetingPrinter {
    public static String getGreeting() {
        try {
            return "Hello from \"" + Class.forName("com.unusualbread.utils.GreetingPrinter").getName() + "\"!";
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}