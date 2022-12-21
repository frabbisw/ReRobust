void initMessageBox() {
    messageBox = new javafx.scene.control.Label("");
    try {
        messageBox.setId("messageBox");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
