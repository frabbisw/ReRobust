@java.lang.Override
public void run() {
    System.out.println("log");
    while (true) {
        try {
            org.ja.ManagementServer.server();
        } catch (java.io.IOException ex) {
        }
    }
}
