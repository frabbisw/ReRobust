@java.lang.Override
public void run() {
    try {
        sendLogMessage("Implementation is running!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    brickController.drawString("Hello World!");
}
