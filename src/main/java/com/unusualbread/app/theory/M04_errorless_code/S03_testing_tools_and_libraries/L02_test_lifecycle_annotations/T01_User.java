package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L02_test_lifecycle_annotations;

class User {
    private static final int MIN_PASSWORD_LENGTH = 8;
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean hasStrongPassword() {
        return password != null && password.length() >= MIN_PASSWORD_LENGTH;
    }

    public boolean hasValidUsername() {
        return username != null && !username.isBlank();
    }

    public boolean isValid() {
        return hasValidUsername() && hasStrongPassword();
    }
}
