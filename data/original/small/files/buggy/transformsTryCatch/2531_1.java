@java.lang.Override
public void run() {
    gameUI.placeTokens(gamePieceLoc);
    try {
        gameUI.gameHistoryTA.appendText((gameUpdate + "\n"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
