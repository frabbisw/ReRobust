@java.lang.Override
public void unregister(com.dreameddeath.infrastructure.daemon.AbstractDaemon daemon) throws java.lang.Exception {
    if (null != (_currDaemonNode)) {
        _currDaemonNode.close();
    }
}
