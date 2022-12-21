public void displayContextMenu(javafx.scene.control.ContextMenu contextMenu, org.Point point, double xLocation, double yLocation) {
    try {
        contextMenu.show(circles.get(point).getScene().getWindow(), xLocation, yLocation);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    handlePoint(point);
}
