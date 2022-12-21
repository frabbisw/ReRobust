@java.lang.Override
public void unregister(com.dreameddeath.infrastructure.daemon.AbstractDaemon daemon) throws java.lang.Exception {
    System.out.println("log");
    if ((_currDaemonNode) != null) {
        _currDaemonNode.close();
    }
}
