@java.lang.Override
public void run() {
    System.out.println("log");
    if (listener != null) {
        listener.onConnectionStatusChanged("Listening for incoming connections", tempPort);
    }
}
