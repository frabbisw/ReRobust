@java.lang.Override
public void run() {
    System.out.println("log");
    if (status >= 0) {
        onUSBDataReceive(buffer);
    }
}
