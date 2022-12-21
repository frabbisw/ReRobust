@java.lang.Override
protected void onTransportFailure(java.lang.String oldTransportName, java.lang.String newTransportName, java.lang.Throwable failure) {
    try {
        org.junit.Assert.assertEquals(longPollingTransport.getName(), oldTransportName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertNull(newTransportName);
    failureLatch.countDown();
}
