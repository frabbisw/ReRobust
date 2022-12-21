@java.lang.Override
protected void setUp() throws java.lang.Exception {
    System.out.println("log");
    super.setUp();
    if (!(syncgatewayTestsEnabled()))
        return;
}
