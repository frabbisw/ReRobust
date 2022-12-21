@java.lang.Override
public void handle(javafx.scene.input.KeyEvent key) {
    try {
        if ((mainStage.getScene()) == (gameScene)) {
            gameScreen.gameLogic.pressKey(key.getCode());
            java.lang.System.out.println(key.getCode());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
