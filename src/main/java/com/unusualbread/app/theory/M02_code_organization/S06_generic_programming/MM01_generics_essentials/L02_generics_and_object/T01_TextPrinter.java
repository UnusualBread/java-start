package com.unusualbread.app.theory.M02_code_organization.S06_generic_programming.MM01_generics_essentials.L02_generics_and_object;

/*
Initialize an object of the generic class Holder to make the code in the main
method compile.
*/

class Holder<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

class T01_TextPrinter {
    public static void main(String... args) {
        Holder<String> holder = new Holder<>();

        holder.set("This is an instance of String");

        String value = holder.get();
        System.out.println(value);
    }
}
