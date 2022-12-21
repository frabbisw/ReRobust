public static void assertNotContainsDestination(java.lang.String message, com.pronoia.junit.activemq.EmbeddedActiveMQBroker broker, java.lang.String expected) {
    try {
        org.junit.Assert.assertFalse(message, (null != (com.pronoia.junit.asserts.activemq.EmbeddedBrokerAssert.getDestination(broker, expected))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
