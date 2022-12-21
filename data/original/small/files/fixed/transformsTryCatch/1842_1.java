@java.lang.Override
public void run() {
    sendLogMessage("Implementation is running!");
    try {
        brickController.drawString("Hello World!", 1, 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
