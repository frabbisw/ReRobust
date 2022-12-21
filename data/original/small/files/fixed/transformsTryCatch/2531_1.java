@java.lang.Override
public void run() {
    try {
        gameUI.gameHistoryTA.appendText((gameUpdate + "\n"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
