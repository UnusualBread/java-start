package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS02_nested_classes.L01_anonymous_class;

/*
You should implement the given method createRunnable that takes two arguments:
text and repeats. The method must return an instance of an anonymous class
implementing java.lang.Runnable. The overridden method of the anonymous class
should print the text to the standard output a specified number of times.
*/

class Create {

    public static Runnable createRunnable(String text, int repeats) {
        return new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < repeats; i++) System.out.println(text);
            }
        };
    }
}
