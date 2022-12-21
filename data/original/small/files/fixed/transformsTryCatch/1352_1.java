public static void assertNotContainsDestination(java.lang.String message, com.pronoia.junit.activemq.EmbeddedActiveMQBroker broker, java.lang.String expected) {
    try {
        org.junit.Assert.assertFalse(message, (null != (broker.getDestination(expected))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
