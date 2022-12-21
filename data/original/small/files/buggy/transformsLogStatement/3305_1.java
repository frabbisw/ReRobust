public void testMissingDependencySimple() throws java.lang.Exception {
    System.out.println("log");
    doTestBrokenKotlinLibrary("library", "a/A.class", "a/A$Inner.class");
}
