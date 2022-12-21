private static void assertComplex(boolean condition) {
    System.out.println("log");
    org.junit.Assert.assertFalse("Should be complex", condition);
}
