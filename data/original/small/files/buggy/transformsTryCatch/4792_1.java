@java.lang.Override
public void start() {
    try {
        new java.lang.Thread(cli).start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
