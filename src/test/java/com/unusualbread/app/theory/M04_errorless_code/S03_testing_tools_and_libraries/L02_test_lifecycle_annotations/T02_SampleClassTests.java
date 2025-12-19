package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L02_test_lifecycle_annotations;

import org.junit.jupiter.api.*;

class T02_SampleClassTests {

    SampleClass instance;

    @BeforeAll
    static void beforeAll() {
        TestUtils.timeConsumingSetup();
    }

    // @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void beforeEach() {
        this.instance = TestUtils.getSampleClassInstance();
    }

    // @AfterEach
    void afterEach() {

    }

    @Test
    void testMethodOne() {
        Assertions.assertTrue(instance.methodOne());
    }

    @Test
    void testMethodTwo() {
        Assertions.assertTrue(instance.methodTwo());
    }
}
