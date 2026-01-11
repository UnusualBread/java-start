package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L03_enumset;

/*
In the news headlines, you want the age group eligible for vaccination to
flash. For that you need to have an EnumSet that contains code for allowed age
groups. Your task is to create such a set and print it.
*/

import java.util.EnumSet;

public class T02_AgeGroupsPrinter {

    public enum Age {
        AGE_0_TO_10, AGE_11_TO_17, AGE_18_TO_45, AGE_46_TO_60, AGE_60_ABOVE
    }

    public static void main(String[] args) {

        EnumSet<Age> notAllowedAgeGroups = EnumSet.of(Age.AGE_0_TO_10, Age.AGE_11_TO_17);

        EnumSet<Age> allowedAgeGroups = EnumSet.complementOf(notAllowedAgeGroups);

        System.out.println(allowedAgeGroups);
    }

}
