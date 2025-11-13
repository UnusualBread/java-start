package com.unusualbread.app.projects.D03_hard.P03_coffee_machine_simulator.machine;

import com.unusualbread.app.projects.D03_hard.P03_coffee_machine_simulator.controller.CoffeeMachineController;

import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;
    private int coffeeCount = 0;

    public CoffeeMachine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

        CoffeeMachineController controller = new CoffeeMachineController();

        boolean isExit = false;

        while (!isExit) {
            String action = controller.askAction(sc);

            System.out.println();

            isExit = controller.doAction(action, sc, coffeeMachine);

            System.out.println();
        }

        sc.close();
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCoffeeCount() {
        return coffeeCount;
    }

    public void setCoffeeCount(int coffeeCount) {
        this.coffeeCount = coffeeCount;
    }
}
