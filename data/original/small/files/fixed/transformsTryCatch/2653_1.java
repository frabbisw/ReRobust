private static void assertComplex(boolean condition) {
    try {
        assertFalse("Should be complex", condition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
