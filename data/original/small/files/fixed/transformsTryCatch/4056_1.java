@java.lang.Override
public void close() {
    try {
        if ((port) != null) {
            port.close();
            port = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
