package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L03_enumset;

/*
Assume you need to optimize the code where set is an instance of Set and
contains elements from the Element enum. Which Java class in the java.util
package is better to use with enums instead of HashSet? Choose the best
implementation class and use it to initialize the set instance instead of
HashSet.
*/

import java.util.EnumSet;

public class T03_EnumConstantsPrinter {

    enum Element {
        FIRE, WIND, EARTH, SKY, WATER
    }

    public static void main(String[] args) {

        EnumSet<Element> set = EnumSet.allOf(Element.class);

        System.out.println(set instanceof EnumSet<Element>);
        System.out.println(set);
    }
}
