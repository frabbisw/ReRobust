@java.lang.Override
public void onError(java.lang.Throwable e) {
    com.netflix.eureka2.transport.base.HeartBeatConnection.logger.error(((delegate.name()) + "Heartbeat receiver subscription got an error. This will close the connection "), e);
    shutdown();
}
