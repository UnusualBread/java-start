package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L01_what_are_collections;

/*
Add one, two, three Strings to the list field in the provided order.
*/

import java.util.ArrayList;

class Main {
    ArrayList<String> list = new ArrayList<>();

    void init() {
        list.add("one");
        list.add("two");
        list.add("three");
    }
}

class Test {
    public static void main(String[] args) {
        Main main = new Main();
        main.init();

        for (String str : main.list) {
            System.out.println(str);
        }
    }
}
