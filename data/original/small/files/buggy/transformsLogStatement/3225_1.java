@java.lang.Override
public void stop() {
    running.set(false);
    thread.interrupt();
    System.out.println("log");
    try {
        thread.join();
    } catch (java.lang.InterruptedException ignored) {
    }
}
