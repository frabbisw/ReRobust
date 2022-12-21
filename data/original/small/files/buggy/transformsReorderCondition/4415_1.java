@java.lang.Override
public void run() {
    if (null != listener) {
        listener.onConnectionStatusChanged("Listening for incoming connections", tempPort);
    }
}
