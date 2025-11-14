package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L01_template_method;

/*
Your task is to implement the abstract class Career with a template method
called execute() and an abstract method called work() using the following
algorithm:

Dream
Plan
Study
Work
*/

import java.util.Scanner;

abstract class Career {

    public void execute() {
        dream();

        plan();

        study();

        work();
    }

    abstract void work();

    public void dream() {
        System.out.println("Dream big!");
    }

    public void plan() {
        System.out.println("Draw a plan!");
    }

    public void study() {
        System.out.println("Study!");
    }
}

class Engineer extends Career {

    @Override
    void work() {
        System.out.println("Work as a Full Stack Engineer");
    }
}

class DataScientist extends Career {

    @Override
    void work() {
        System.out.println("Work as a Data Scientist");
    }
}

class T02_CareerPlanPrinter {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        Career plan = null;
        if ("engineer".equalsIgnoreCase(type)) {
            plan = new Engineer();
        } else if ("scientist".equalsIgnoreCase(type)) {
            plan = new DataScientist();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        plan.execute();
    }
}
