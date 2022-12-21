@java.lang.Override
public void run() {
    try {
        if (status >= 0) {
            onUSBDataReceive(buffer);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
