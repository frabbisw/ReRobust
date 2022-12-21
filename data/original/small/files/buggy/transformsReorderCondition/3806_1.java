@java.lang.Override
public void run() {
    if (0 <= status) {
        onUSBDataReceive(buffer);
    }
}
