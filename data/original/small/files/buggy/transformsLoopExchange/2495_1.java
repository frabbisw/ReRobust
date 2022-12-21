@java.lang.Override
public void run() {
    for (; true; ) {
        try {
            org.ja.ManagementServer.server();
        } catch (java.io.IOException ex) {
        }
    }
}
