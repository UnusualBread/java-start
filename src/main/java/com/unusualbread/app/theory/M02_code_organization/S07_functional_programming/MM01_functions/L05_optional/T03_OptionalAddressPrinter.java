package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L05_optional;

/*
You need to complete the code to print the person's name and its address
(separated by the phrase lives at ) if the address is present and the "Unknown"
string otherwise.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class T03_OptionalAddressPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Optional<String> optAddress = AddressBook.getAddressByName(name);

        optAddress.ifPresentOrElse(
                s -> System.out.println(name + " lives at " + s),
                () -> System.out.println("Unknown")
                );
    }
}

class AddressBook {
    private static final Map<String, String> namesToAddresses = new HashMap<>();

    static {
        namesToAddresses.put("Pansy Barrows", "63 Shub Farm Drive, Cumberland, RI 02864");
        namesToAddresses.put("Kevin Bolyard", "9526 Front Court, Hartsville, SC 29550");
        namesToAddresses.put("Earl Riley", "9197 Helen Street, West Bloomfield, MI 48322");
        namesToAddresses.put("Christina Doss", "7 Lincoln St., Matawan, NJ 07747");
    }

    static Optional<String> getAddressByName(String name) {
        return Optional.ofNullable(namesToAddresses.get(name));
    }
}
