@java.lang.Override
public synchronized void unregister(com.dreameddeath.infrastructure.daemon.AbstractDaemon daemon) throws java.lang.Exception {
    try {
        if ((_currDaemonNode) != null) {
            _currDaemonNode.close();
            _currDaemonNode = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
