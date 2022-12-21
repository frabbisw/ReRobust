@java.lang.Override
public void run() {
    try {
        if (listener != null) {
            listener.onConnectionStatusChanged("Listening for incoming connections", tempPort);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
