@java.lang.Override
public void onStart() {
    try {
        if ((newInstanceTile) == null) {
            newInstanceTile = ((javafx.scene.layout.StackPane) (instancePane.getChildren().get(0)));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
