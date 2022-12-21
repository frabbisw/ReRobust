@java.lang.Override
public void unregister(com.dreameddeath.infrastructure.daemon.AbstractDaemon daemon) throws java.lang.Exception {
    try {
        if ((_currDaemonNode) != null) {
            _currDaemonNode.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
