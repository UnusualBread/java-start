package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L03_the_set_interface;

/*
Implement a method for finding the symmetric difference of the two given sets
of strings.
*/

import java.util.*;

class SetUtils {
    public static Set<String> symmetricDifference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        Set<String> temp = new HashSet<>(set2);
        temp.removeAll(set1);
        result.addAll(temp);
        return result;
    }
}

public class T02_SymmetricDifferenceFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strSet1 = scanner.nextLine();
        String strSet2 = scanner.nextLine();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        if (!Objects.equals(strSet1, "empty")) {
            Collections.addAll(set1, strSet1.split("\\s+"));
        }

        if (!Objects.equals(strSet2, "empty")) {
            Collections.addAll(set2, strSet2.split("\\s+"));
        }

        Set<String> resultSet = SetUtils.symmetricDifference(set1, set2);

        System.out.println(String.join(" ", resultSet));
    }
}