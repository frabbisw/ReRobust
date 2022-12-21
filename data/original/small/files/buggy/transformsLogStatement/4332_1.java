@java.lang.Override
public void endEngine() {
    pl.engine.Utils.debug("END GAME..");
    gameManager.stopTimer();
    System.out.println("log");
    gameManager.summaryScoreByGame(this, teams);
    gc.nextEngine();
}
