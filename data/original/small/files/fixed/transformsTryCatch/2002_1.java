@java.lang.Override
public void run() {
    try {
        publishMessage(entry.getValue());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
