package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L01_template_method;

/*
Your task is to implement the abstract class SocialNetwork with a template
method called connect() and three abstract methods using the following
algorithm:

Log in
Post a message
Log out
*/

import java.util.Scanner;

abstract class SocialNetwork {

    public void connect() {
        login();

        post();

        logout();
    }

    abstract void login();

    abstract void post();

    abstract void logout();

}

class Instagram extends SocialNetwork {

    @Override
    void login() {
        System.out.println("Log into Instagram");
    }

    @Override
    void post() {
        System.out.println("Post: Hello, Instagram!");
    }

    @Override
    void logout() {
        System.out.println("Log out of Instagram");
    }
}

class Facebook extends SocialNetwork {
    @Override
    void login() {
        System.out.println("Log into Facebook");
    }

    @Override
    void post() {
        System.out.println("Post: Hello, Facebook!");
    }

    @Override
    void logout() {
        System.out.println("Log out of Facebook");
    }
}

class T04_SocialNetworkConnectionPrinter {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        SocialNetwork network = null;
        if ("facebook".equalsIgnoreCase(type)) {
            network = new Facebook();
        } else if ("instagram".equalsIgnoreCase(type)) {
            network = new Instagram();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        network.connect();
    }
}
