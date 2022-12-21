@java.lang.Override
public void run() {
    for (; (thread) != null; ) {
        try {
            step();
            java.lang.Thread.sleep(20);
        } catch (java.lang.InterruptedException ex) {
        }
    }
}
