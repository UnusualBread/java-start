package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L03_strategy;

/*
Use the strategy pattern to implement algorithms to find max and min values in
a given array. The basic structure of the provided classes is described below:
your job is to complete it.

The class Finder represents the general finding algorithm itself. It has
find(int[] numbers) method that returns the result of finding according to the
specified strategy.

The interface FindingStrategy provides getResult() method to write new concrete
finding strategies.

If the array is empty, the Finder should return Integer.MAX_VALUE in case of
finding the min value and Integer.MIN_VALUE in case of finding the max value.
*/

import java.util.Scanner;

class Finder {

    private FindingStrategy strategy;

    public Finder(FindingStrategy strategy) {
        this.strategy = strategy;
    }

    public int find(int[] numbers) {
        return strategy.getResult(numbers);
    }
}

interface FindingStrategy {
    int getResult(int[] numbers);
}

class MaxFindingStrategy implements FindingStrategy {
    public int getResult(int[] numbers) {
        return switch (numbers.length) {
            case 0 -> Integer.MIN_VALUE;
            case 1 -> numbers[0];
            default -> {
                int max = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                yield  max;
            }
        };
    }
}

class MinFindingStrategy implements FindingStrategy {
    public int getResult(int[] numbers) {
        return switch (numbers.length) {
            case 0 -> Integer.MAX_VALUE;
            case 1 -> numbers[0];
            default -> {
                int min = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }
                yield min;
            }
        };
    }
}

public class T01_MaxAndMinFinder {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String[] elements = scanner.nextLine().split("\\s+");
        int[] numbers = null;

        if ("EMPTY".equals(elements[0])) {
            numbers = new int[0];
        } else {
            numbers = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                numbers[i] = Integer.parseInt(elements[i]);
            }
        }

        final String type = scanner.nextLine();

        Finder finder = null;

        switch (type) {
            case "MIN":
                finder = new Finder(new MinFindingStrategy());
                break;
            case "MAX":
                finder = new Finder(new MaxFindingStrategy());
                break;
            default:
                break;
        }

        if (finder == null) {
            throw new RuntimeException(
                    "Unknown strategy type passed. Please, write to the author of the problem.");
        }

        System.out.println(finder.find(numbers));
    }
}
