private static void assertPrime(boolean condition) {
    try {
        org.junit.Assert.assertTrue("Should be prime", condition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
