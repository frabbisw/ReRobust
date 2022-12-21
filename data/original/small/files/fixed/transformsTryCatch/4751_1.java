public void draw(javafx.scene.layout.Pane canvas) {
    remove(canvas);
    java.lang.System.out.println("Drawing sprite...");
    try {
        canvas.getChildren().addAll(spriteView);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
