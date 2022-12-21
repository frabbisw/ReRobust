void doRestart() {
    stopTimer();
    isRestartGame = true;
    if ((isFirstClickDo) && (!(isGameEnd))) {
        myApp.writeStatistics(currentWidth, currentHeight, currentMines);
    }
    gameField.restartField();
    try {
        setOriginalValue();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
