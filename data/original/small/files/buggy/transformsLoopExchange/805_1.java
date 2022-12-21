@java.lang.Override
public void execute() {
    if ((gameUI) == null) {
        gameUI = new DrawGame();
    }
    gameUI.show();
    for (; true; ) {
        t.read();
    }
}
