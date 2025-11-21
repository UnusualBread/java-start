package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L02_test_lifecycle_annotations;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class T01_UserTest {

    static String[] names;
    static String[] passwords;
    static boolean[] expectedOutcomes;

    static int index = 0;

    User user;
    boolean expected;

    @BeforeAll
    static void setUp() {
        names = new String[] {"Alice", "Alice", "Alice", "", null, "    "};
        passwords = new String[] {"12345678", "123", null, "12345678", "12345678", "12345678"};
        expectedOutcomes = new boolean[] {true, false, false, false, false, false};
    }

    @BeforeEach
    void createUser() {
        user = new User(names[index], passwords[index]);
        expected = expectedOutcomes[index];
    }

    @AfterEach
    void incrementIndex() {
        index++;
    }

    @RepeatedTest(value = 6, name = "user.isValid() test {currentRepetition}/{totalRepetitions}")
    void isValid() {
        assertEquals(expected, user.isValid());
    }
}