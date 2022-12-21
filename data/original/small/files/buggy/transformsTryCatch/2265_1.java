@java.lang.Override
public void run() {
    try {
        listenForDevices(aListener, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
