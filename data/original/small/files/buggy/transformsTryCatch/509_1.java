public void drawMap(javafx.scene.canvas.GraphicsContext gc, java.util.List<MapElement> mapElements, javafx.scene.Group root) {
    try {
        makeBackground(gc);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    drawGridLines(gc);
    drawMapElements(gc, mapElements, root);
}
