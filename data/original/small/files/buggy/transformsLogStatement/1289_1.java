@java.lang.Override
public void run() {
    System.out.println("log");
    try {
        while (1) {
            java.lang.Thread.sleep(1000);
            this.getState().tick();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
