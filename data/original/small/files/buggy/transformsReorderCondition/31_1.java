@java.lang.Override
public void onError(java.lang.Throwable e) {
    com.netflix.eureka2.transport.base.HeartBeatConnection.logger.warn(((delegate.name()) + "Failed to send heartbeat message; terminating the connection "), e);
    shutdown();
}
