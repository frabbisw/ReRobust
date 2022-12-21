public void setBold() {
    try {
        buttonShape.setOpacity(0.8);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    buttonShape.setFill(javafx.scene.paint.Color.DARKGRAY);
}
