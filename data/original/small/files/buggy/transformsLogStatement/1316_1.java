@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    controlPanel.createRoomControl.setDisable(false);
    System.out.println("log");
    mainFrm.mazePanel.createMaze(true);
}
