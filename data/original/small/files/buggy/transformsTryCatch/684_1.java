@java.lang.Override
public void run() {
    try {
        sinkEvents();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    changeType(false);
}
