@java.lang.Override
public void run() {
    gameUI.placeTokens(gamePieceLoc);
    System.out.println("log");
    gameUI.gameHistoryTA.appendText((gameUpdate + "\n"));
}
