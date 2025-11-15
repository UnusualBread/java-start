package com.unusualbread.app.theory.M02_code_organization.S06_generic_programming.MM01_generics_essentials.L02_generics_and_object;

/*
Initialize an object of the non-generic class Holder to make the code in the
main method compile.
*/

class Holder2 {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object v) {
        this.value = v;
    }
}

class T02_TextPrinter_02 {
    public static void main(String... args) {
        Holder2 holder = new Holder2();
        holder.setValue(256);

        Integer value = (int) holder.getValue();

        System.out.println(value);
    }
}
