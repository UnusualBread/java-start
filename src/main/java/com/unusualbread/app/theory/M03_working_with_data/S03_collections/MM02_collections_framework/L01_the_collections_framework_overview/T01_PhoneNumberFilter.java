package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L01_the_collections_framework_overview;

/*
You should implement the filterPhones method that returns only the phone
numbers that are not on the blacklist.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectionUtils {

    public static Collection<String> filterPhones(Collection<String> phones, Collection<String> blacklist) {
        phones.removeAll(blacklist);
        return phones;
    }
}

class T01_PhoneNumberFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));

        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}