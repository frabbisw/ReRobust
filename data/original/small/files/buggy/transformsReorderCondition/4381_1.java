@java.lang.Override
public void run() {
    while (null != (thread)) {
        try {
            step();
            java.lang.Thread.sleep(20);
        } catch (java.lang.InterruptedException ex) {
        }
    }
}
