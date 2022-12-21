@java.lang.Override
protected void setUp() throws java.lang.Exception {
    try {
        if (!(syncgatewayTestsEnabled()))
            return;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.setUp();
}
