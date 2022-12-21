@java.lang.Override
public void handle(javafx.scene.input.KeyEvent key) {
    System.out.println("log");
    if ((mainStage.getScene()) == (gameScene)) {
        gameScreen.gameLogic.pressKey(key.getCode());
        java.lang.System.out.println(key.getCode());
    }
}
