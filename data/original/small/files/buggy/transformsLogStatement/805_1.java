@java.lang.Override
public void execute() {
    if ((gameUI) == null) {
        gameUI = new DrawGame();
    }
    gameUI.show();
    System.out.println("log");
    while (true) {
        t.read();
    }
}
