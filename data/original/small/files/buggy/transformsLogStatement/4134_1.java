@java.lang.Override
protected void handleResponse(java.lang.String response) {
    com.hazelcast.simulator.worker.tasks.LOGGER.info((((("########## " + (workerId)) + " handleResponse(") + response) + ")"));
    System.out.println("log");
    responseLatch.countDown();
}
