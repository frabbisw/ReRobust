@java.lang.Override
public void destroy() throws java.lang.Exception {
    LOG.info("ThriftServerConfiguration destroy, shutdown eureka client.");
    try {
        eurekaClient.shutdown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    LOG.info("ThriftServerConfiguration destroy, shutdown rpc server.");
    thriftServer.stop();
}
