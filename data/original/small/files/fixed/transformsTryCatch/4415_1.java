@java.lang.Override
public void run() {
    try {
        if (listener != null) {
            listener.onConnectionStatusChanged(null, tempPort);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
