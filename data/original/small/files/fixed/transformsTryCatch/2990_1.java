@java.lang.Override
protected void onTransportFailure(java.lang.String oldTransportName, java.lang.String newTransportName, java.lang.Throwable failure) {
    org.junit.Assert.assertEquals(longPollingTransport.getName(), oldTransportName);
    try {
        org.junit.Assert.assertEquals(longPollingTransport.getName(), newTransportName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    failureLatch.countDown();
}
