@java.lang.Override
public void execute() {
    if (null == (gameUI)) {
        gameUI = new DrawGame();
    }
    gameUI.show();
    while (true) {
        t.read();
    }
}
