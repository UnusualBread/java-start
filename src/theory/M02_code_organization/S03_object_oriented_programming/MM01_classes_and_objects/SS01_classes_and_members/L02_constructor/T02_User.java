package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L02_constructor;

/*
Write a class named User. It must have three string fields: login, firstName,
and lastName and a constructor with three parameters to initialize these fields.
The order of parameters in the constructor must be the same as presented above.
*/

class User {
    String login;
    String firstName;
    String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
