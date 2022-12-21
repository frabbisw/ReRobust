@java.lang.Override
public void doControl() {
    try {
        generateAndSendPathToBall();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
