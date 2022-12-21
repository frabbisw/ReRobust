@java.lang.Override
public void testIgnored(final org.junit.runner.Description description) throws java.lang.Exception {
    try {
        if (testingThisTest(description)) {
            stepEventBus().testIgnored();
            endTest();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
