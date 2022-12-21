@java.lang.Override
public void onError(java.lang.Throwable e) {
    try {
        com.netflix.eureka2.transport.base.HeartBeatConnection.logger.warn(("Failed to send heartbeat message; terminating the connection " + (delegate.name())), e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    shutdown();
}
