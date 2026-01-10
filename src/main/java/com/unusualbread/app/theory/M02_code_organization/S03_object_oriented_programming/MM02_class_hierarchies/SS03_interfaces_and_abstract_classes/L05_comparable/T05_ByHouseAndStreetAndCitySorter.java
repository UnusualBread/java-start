package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L05_comparable;

/*
Our information system stores mailing addresses using the Address class. Users
want to see addresses listed in alphabetical order. It means we need to sort
the addresses and for this purpose we must be able to compare Address objects
with each other. Make the Address class Comparable so we can do it! The full
address format is defined in the toString method. Follow it when comparing
addresses.
*/

import java.util.*;

class Address implements Comparable<Address> {
    private final String city;
    private final String street;
    private final String house;

    public Address(String city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public int compareTo(Address address) {
        int result = house.compareTo(address.house);
        if (result == 0) {
            result = street.compareTo(address.street);
            if (result == 0) {
                result = city.compareTo(address.city);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "%s, %s, %s".formatted(house, street, city);
    }
}

class T05_ByHouseAndStreetAndCitySorter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Address> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] arguments = sc.nextLine().split(",");
            list.add(new Address(arguments[0], arguments[1], arguments[2]));
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}