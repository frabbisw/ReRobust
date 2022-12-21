@java.lang.Override
public void destroy() throws java.lang.Exception {
    try {
        LOG.info("ThriftServerConfiguration destroy, shutdown eureka client.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    eurekaClient.shutdown();
    java.lang.Thread.sleep(java.util.concurrent.TimeUnit.SECONDS.toMillis(6));
    LOG.info("ThriftServerConfiguration destroy, shutdown rpc server.");
    thriftServer.stop();
}
