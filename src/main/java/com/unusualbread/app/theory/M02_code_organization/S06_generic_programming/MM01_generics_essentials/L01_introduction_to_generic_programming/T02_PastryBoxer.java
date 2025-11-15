package com.unusualbread.app.theory.M02_code_organization.S06_generic_programming.MM01_generics_essentials.L01_introduction_to_generic_programming;

/*
You were asked to help with Java programming for a pie company. At the moment,
they bake pies, cakes, and tarts and pack them in nice boxes to sell.
Unfortunately, their approach to box programming is quite outdated and each pie
type requires its own box class. This approach is poorly scalable and will turn
the situation into a nightmare with product range growth (imagine all these:
ApplePieBox, StrawberryPieBox, etc.).

Implement a universal Box class that will accommodate anything with put methods
and give it back with get methods.
*/

class Box<T> {

    private T t;

    public void put(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

class Cake { }

class Pie { }

class Tart { }