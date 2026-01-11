package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L03_enumset;

/*
You are working at a company that works with the given jobs, as well as the
languages specified by the above enums. Based on the job, the
getRequirementsByRole method must return the EnumSet<Language> of basic
language requirements
*/

import java.util.EnumSet;
import java.util.Scanner;

public class T04_JobRequirementsPrinter {

    enum Language {
        JAVA, C_PLUS_PLUS, PYTHON, C_SHARP, JAVA_SCRIPT, HTML, CSS
    }

    enum Role {
        WEB_DEVELOPER, DATA_SCIENTIST, JAVA_EXPERT, GAME_DEVELOPER,
        COMPETITIVE_CODER
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roleName = scanner.next();
        try {
            Role role = Role.valueOf(roleName);
            EnumSet<Language> languages = getRequirementsByRole(role);
            System.out.println("Job Code : " + role);
            System.out.println("Prerequisite : " + languages);
        } catch (IllegalArgumentException e) {
            System.out.println("Thank you for considering us but there is no vacancy.");
        }
    }

    public static EnumSet<Language> getRequirementsByRole(Role role) {
        return switch (role) {
            case WEB_DEVELOPER -> EnumSet.of(Language.JAVA_SCRIPT, Language.HTML, Language.CSS);
            case DATA_SCIENTIST -> EnumSet.of(Language.PYTHON);
            case JAVA_EXPERT -> EnumSet.of(Language.JAVA);
            case GAME_DEVELOPER -> EnumSet.of(Language.C_SHARP);
            case COMPETITIVE_CODER -> EnumSet.of(Language.C_PLUS_PLUS);
        };
    }
}