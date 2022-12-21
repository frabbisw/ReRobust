@java.lang.Override
public void run() {
    try {
        node.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
