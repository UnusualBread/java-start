package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L03_static_members;

/*
You are given two methods, requestProduct and getNumberOfProducts:
    - getNumberOfProducts should return the total number of requested products;
    - requestProduct should keep track of requested products, and format the
      product argument in the format: No. Requested Detail.
*/

import java.util.Scanner;

class ManufacturingController {
    // here you may declare a field
    static int counter;

    public static String requestProduct(String product) {
        // write your code here
        counter++;
        return counter + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return counter;
    }
}

class T04_ProductRequestCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}
