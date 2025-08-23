package projects.D03_hard.P03_coffee_machine_simulator.controller;

import projects.D03_hard.P03_coffee_machine_simulator.coffee.Coffee;
import projects.D03_hard.P03_coffee_machine_simulator.machine.CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachineController {
    public boolean doAction(String action, Scanner sc, CoffeeMachine coffeeMachine) {
        switch (action) {
            case "buy" -> handleBuy(sc, coffeeMachine);
            case "fill" -> fill(sc, coffeeMachine);
            case "take" -> take(coffeeMachine);
            case "clean" -> clean(coffeeMachine);
            case "remaining" -> printState(coffeeMachine);
            case "exit" -> {
                return true;
            }
        }

        return false;
    }

    private static void clean(CoffeeMachine coffeeMachine) {
        coffeeMachine.setCoffeeCount(0);
        System.out.println("I have been cleaned!");
    }

    private void handleBuy(Scanner sc, CoffeeMachine coffeeMachine) {
        if (coffeeMachine.getCoffeeCount() > 9) System.out.println("I need cleaning!");
        else buy(getCoffeeType(sc), coffeeMachine);
    }

    public void take(CoffeeMachine coffeeMachine) {
        System.out.printf("I gave you $%d\n", coffeeMachine.getMoney());
        coffeeMachine.setMoney(0);
    }

    public void fill(Scanner sc, CoffeeMachine coffeeMachine) {
        addWater(sc, coffeeMachine);
        addMilk(sc, coffeeMachine);
        addCoffeeBeans(sc, coffeeMachine);
        addDisposableCups(sc, coffeeMachine);
        sc.nextLine();
    }

    public void addDisposableCups(Scanner sc, CoffeeMachine coffeeMachine) {
        System.out.println("Write how many disposable cups you want to add:");
        coffeeMachine.setDisposableCups(getDisposableCups(sc.nextInt(), coffeeMachine));
    }

    private static int getDisposableCups(int number, CoffeeMachine coffeeMachine) {
        return coffeeMachine.getDisposableCups() + number;
    }

    public void addCoffeeBeans(Scanner sc, CoffeeMachine coffeeMachine) {
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeMachine.setCoffeeBeans(getCoffeeBeans(sc.nextInt(), coffeeMachine));
    }

    private int getCoffeeBeans(int number, CoffeeMachine coffeeMachine) {
        return coffeeMachine.getCoffeeBeans() + number;
    }

    public void addMilk(Scanner sc, CoffeeMachine coffeeMachine) {
        System.out.println("Write how many ml of milk you want to add:");
        coffeeMachine.setMilk(getMilk(sc.nextInt(), coffeeMachine));
    }

    private int getMilk(int number, CoffeeMachine coffeeMachine) {
        return coffeeMachine.getMilk() + number;
    }

    public void addWater(Scanner sc, CoffeeMachine coffeeMachine) {
        System.out.println("Write how many ml of water you want to add:");
        coffeeMachine.setWater(getWater(sc.nextInt(), coffeeMachine));
    }

    private int getWater(int number, CoffeeMachine coffeeMachine) {
        return coffeeMachine.getWater() + number;
    }

    public Coffee getCoffeeType(Scanner sc) {
        int coffeeNumber = getCoffeeNumber(sc);
        return coffeeNumber == -1 ? null : Coffee.values()[coffeeNumber];
    }

    public void buy(Coffee coffee, CoffeeMachine coffeeMachine) {
        if (coffee == null) return;
        int machineWater = coffeeMachine.getWater();
        int machineMilk = coffeeMachine.getMilk();
        int machineCoffeeBeans = coffeeMachine.getCoffeeBeans();
        int machineDisposableCups = coffeeMachine.getDisposableCups();

        int coffeeWater = coffee.getWater();
        int coffeeMilk = coffee.getMilk();
        int coffeeCoffeeBeans = coffee.getCoffeeBeans();
        int coffeeDisposableCups = coffee.getDisposableCups();

        if (isEnoughAmount(machineWater, coffeeWater, machineMilk, coffeeMilk, machineCoffeeBeans, coffeeCoffeeBeans, machineDisposableCups, coffeeDisposableCups)) subtractAmounts(coffee, coffeeMachine, coffeeWater, coffeeMilk, coffeeCoffeeBeans, coffeeDisposableCups);
        else if (machineWater < coffeeWater) System.out.println("Sorry, not enough water!");
        else if (machineMilk < coffeeMilk) System.out.println("Sorry, not enough milk!");
        else if (machineCoffeeBeans < coffeeCoffeeBeans) System.out.println("Sorry, not enough coffee beans!");
        else System.out.println("Sorry, not enough disposable cups!");
    }

    private static boolean isEnoughAmount(int machineWater, int coffeeWater, int machineMilk, int coffeeMilk, int machineCoffeeBeans, int coffeeCoffeeBeans, int machineDisposableCups, int coffeeDisposableCups) {
        return machineWater >= coffeeWater &&
                machineMilk >= coffeeMilk &&
                machineCoffeeBeans >= coffeeCoffeeBeans &&
                machineDisposableCups >= coffeeDisposableCups;
    }

    private void subtractAmounts(Coffee coffee, CoffeeMachine coffeeMachine, int coffeeWater, int coffeeMilk, int coffeeCoffeeBeans, int coffeeDisposableCups) {
        System.out.println("I have enough resources, making you a coffee!");
        coffeeMachine.setWater(getWater(-coffeeWater, coffeeMachine));
        coffeeMachine.setMilk(getMilk(-coffeeMilk, coffeeMachine));
        coffeeMachine.setCoffeeBeans(getCoffeeBeans(-coffeeCoffeeBeans, coffeeMachine));
        coffeeMachine.setDisposableCups(getDisposableCups(-coffeeDisposableCups, coffeeMachine));
        coffeeMachine.setMoney(addMoney(coffee.getPrice(), coffeeMachine));
        coffeeMachine.setCoffeeCount(coffeeMachine.getCoffeeCount() + 1);
    }

    private int addMoney(int number, CoffeeMachine coffeeMachine) {
        return coffeeMachine.getMoney() + number;
    }

    public int getCoffeeNumber(Scanner sc) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back -");

        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            return number - 1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String askAction(Scanner sc) {
        System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
        return sc.nextLine();
    }

    public void printState(CoffeeMachine coffeeMachine) {
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                """, coffeeMachine.getWater(), coffeeMachine.getMilk(), coffeeMachine.getCoffeeBeans(), coffeeMachine.getDisposableCups(), coffeeMachine.getMoney());
    }
}
