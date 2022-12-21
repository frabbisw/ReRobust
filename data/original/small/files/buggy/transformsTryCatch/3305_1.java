public void testMissingDependencySimple() throws java.lang.Exception {
    try {
        doTestBrokenKotlinLibrary("library", "a/A.class", "a/A$Inner.class");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
