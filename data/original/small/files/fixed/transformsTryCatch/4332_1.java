@java.lang.Override
public void endEngine() {
    pl.engine.Utils.debug("END GAME..");
    gameManager.stopTimer();
    try {
        gameManager.summaryScoreByGame(this, teams);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
