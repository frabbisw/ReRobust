@java.lang.Override
protected void onTransportFailure(java.lang.String oldTransportName, java.lang.String newTransportName, java.lang.Throwable failure) {
    org.junit.Assert.assertEquals(longPollingTransport.getName(), oldTransportName);
    System.out.println("log");
    org.junit.Assert.assertNull(newTransportName);
    failureLatch.countDown();
}
