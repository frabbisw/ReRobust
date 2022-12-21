private static void assertPrime(boolean condition) {
    try {
        assertTrue("Should be prime", condition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
