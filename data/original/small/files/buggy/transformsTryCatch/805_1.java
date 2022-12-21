@java.lang.Override
public void execute() {
    if ((gameUI) == null) {
        gameUI = new DrawGame();
    }
    try {
        gameUI.show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    while (true) {
        t.read();
    }
}
