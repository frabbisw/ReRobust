@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    try {
        if ((controlPanel.createRoomControl) != null)
            controlPanel.createRoomControl.setDisable(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mainFrm.mazePanel.createMaze(true);
}
