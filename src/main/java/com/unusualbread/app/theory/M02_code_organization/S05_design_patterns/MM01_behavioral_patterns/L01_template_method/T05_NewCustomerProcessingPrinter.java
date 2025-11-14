package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L01_template_method;

/*
You must implement the template method in the Customer class to create an
account using the following algorithm:

Verify customer's identity
Generate customer's identification number
Send a thank you message
Send a welcome gift
*/

import java.util.Scanner;

abstract class Customer {

    public void createAccount() {
        verifyIdentity();

        generateCustomerID();

        sayThankYou();

        sendGift();
    }

    public abstract void generateCustomerID();

    public abstract void sendGift();

    public void verifyIdentity() {
        System.out.println("Verify your identity");
    }

    public void sayThankYou() {
        System.out.println("Thank you for creating a new customer account!");
    }
}

class Premium extends Customer {

    @Override
    public void generateCustomerID() {
        System.out.println("Your premium account identification number: PA-01");
    }

    @Override
    public void sendGift() {
        System.out.println("You received 100 Gems");
    }
}

class Standard extends Customer {

    @Override
    public void generateCustomerID() {
        System.out.println("Your standard account identification number: ST-01");
    }

    @Override
    public void sendGift() {
        System.out.println("You received 50 Gems");
    }
}

class T05_NewCustomerProcessingPrinter {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        Customer customer = null;
        if ("premium".equalsIgnoreCase(type)) {
            customer = new Premium();
        } else if ("standard".equalsIgnoreCase(type)) {
            customer = new Standard();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        customer.createAccount();
    }
}
