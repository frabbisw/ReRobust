void doRestart() {
    stopTimer();
    try {
        if ((isFirstClickDo) && (!(isGameEnd))) {
            myApp.writeStatistics(currentWidth, currentHeight, currentMines);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setOriginalValue();
    gameField.restartField();
    isRestartGame = true;
}
