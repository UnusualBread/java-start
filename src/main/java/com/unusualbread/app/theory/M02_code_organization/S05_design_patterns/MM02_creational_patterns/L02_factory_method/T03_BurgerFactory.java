package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM02_creational_patterns.L02_factory_method;

/*
In this task, you will have to write some working code by yourself!
Let's create the BurgerStore. We will stick to the good old classic and simply
create a burger with Bun, Patty and Sauce.
*/

class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        BurgerStore burgerStore = new BurgerStore();

        ChineseBurger chineseBurger = (ChineseBurger) burgerStore.orderBurger("Chinese Burger");
        AmericanBurger americanBurger = (AmericanBurger) burgerStore.orderBurger("American Burger");
        RussianBurger russianBurger = (RussianBurger) burgerStore.orderBurger("Russian Burger");
    }
}

abstract class BurgerFactory {

    abstract Burger createBurger(String type);

    Burger orderBurger(String type) throws InterruptedException {
        Burger burger = createBurger(type);
        if (burger == null) {
            System.out.println("Sorry, we are unable to create this kind of burger\n");
            return null;
        }

        System.out.println("Making a " + burger.getName());
        burger.putBun();
        burger.putCutlet();
        burger.putSauce();
        Thread.sleep(1500L);
        System.out.println(burger.getName() + " ready" + "\n");

        return burger;
    }
}

class BurgerStore extends BurgerFactory {
    @Override
    Burger createBurger(String type) {
        return switch (type) {
            case "Chinese Burger" -> new ChineseBurger();
            case "American Burger" -> new AmericanBurger();
            case "Russian Burger" -> new RussianBurger();
            default -> null;
        };
    }
}

abstract class Burger {
    private String name;

    Burger(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void putBun() {
        System.out.println("Putting bun");
    }

    void putCutlet() {
        System.out.println("Putting patty");
    }

    void putSauce() {
        System.out.println("Putting sauce");
    }

}

class ChineseBurger extends Burger {
    ChineseBurger() {
        super("Chinese Burger");
    }
}

class AmericanBurger extends Burger {
    AmericanBurger() {
        super("American Burger");
    }
}

class RussianBurger extends Burger {
    RussianBurger() {
        super("Russian Burger");
    }
}
