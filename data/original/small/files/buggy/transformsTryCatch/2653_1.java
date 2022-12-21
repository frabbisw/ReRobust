private static void assertComplex(boolean condition) {
    try {
        org.junit.Assert.assertFalse("Should be complex", condition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
