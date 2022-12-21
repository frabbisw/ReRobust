@java.lang.Override
public void run() {
    try {
        onUSBDataReceive(buffer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
