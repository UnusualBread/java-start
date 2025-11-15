package com.unusualbread.app.theory.M02_code_organization.S06_generic_programming.MM01_generics_essentials.L02_generics_and_object;

/*
You were asked to help with Java programming in a company that makes boxes.
Their former Java programmer created a Box class that uses objects and requires
casting. Now everyone knows that casting is slow and error-prone and that is
why the programmer got fired. Now your job is to create Box implementation that
will not require casting but provide type-checking at compile time.
*/

class Box<T> {

    private T t;

    public void put(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

}
