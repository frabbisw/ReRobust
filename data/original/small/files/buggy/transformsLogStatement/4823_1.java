@java.lang.Override
public void testIgnored(final org.junit.runner.Description description) throws java.lang.Exception {
    System.out.println("log");
    if (testingThisTest(description)) {
        stepEventBus().testIgnored();
        stepEventBus().testFinished();
        endTest();
    }
}
