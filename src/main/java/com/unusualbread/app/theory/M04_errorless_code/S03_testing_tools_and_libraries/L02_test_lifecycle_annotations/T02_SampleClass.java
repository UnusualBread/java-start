package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L02_test_lifecycle_annotations;

/*
You are provided with a test class SampleClassTests with methods named
according to their execution order defined by the test instance lifecycle. This
class is intended to test methods of SampleClass which has a complicated
instantiation process, so you are also provided with TestUtils helper class
with getSampleClassInstance static method that creates instances of
SampleClass. However, in order to make TestUtils work, you need run its
timeConsumingSetup static method first.

So your task is to start up TestUtils by calling its timeConsumingSetupmethod,
create new instances of SampleClass using the
TestUtils.getSampleClassInstance() method (testing each SampleClass method will
require a new instance of SampleClass).
*/

class SampleClass {

    public boolean methodOne() {
        return true;
    }

    public boolean methodTwo() {
        return true;
    }
}

class TestUtils {

    private static boolean isSetupDone = false;

    public static void timeConsumingSetup() {
        if (!isSetupDone) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            isSetupDone = true;
            System.out.println("TestUtils: timeConsumingSetup completed");
        }
    }

    public static SampleClass getSampleClassInstance() {
        if (!isSetupDone) {
            throw new IllegalStateException("Setup not done! Call timeConsumingSetup first.");
        }
        return new SampleClass();
    }
}
