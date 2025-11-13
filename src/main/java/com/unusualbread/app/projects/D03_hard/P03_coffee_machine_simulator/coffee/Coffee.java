package com.unusualbread.app.projects.D03_hard.P03_coffee_machine_simulator.coffee;

public enum Coffee {
    ESPRESSO(250, 0, 16, 4, 1),
    LATTE(350, 75, 20, 7, 1),
    CAPPUCCINO(200, 100, 12, 6, 1);

    private final int water;
    private final int milk;
    private final int coffeeBeans;
    private final int price;
    private final int disposableCups;

    Coffee(int water, int milk, int coffeeBeans, int price, int disposableCups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.price = price;
        this.disposableCups = disposableCups;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getPrice() {
        return price;
    }

    public int getDisposableCups() {
        return disposableCups;
    }
}
