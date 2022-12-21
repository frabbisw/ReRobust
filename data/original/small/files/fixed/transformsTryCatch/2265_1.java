@java.lang.Override
public void run() {
    try {
        listenForDevices(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
