@java.lang.Override
public void close() {
    try {
        port.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    port = null;
}
