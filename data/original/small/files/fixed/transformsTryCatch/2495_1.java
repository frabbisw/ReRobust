@java.lang.Override
public void run() {
    try {
        org.ja.ManagementServer.server();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
