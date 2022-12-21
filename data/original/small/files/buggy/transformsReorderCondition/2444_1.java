void doRestart() {
    stopTimer();
    isRestartGame = true;
    if ((!(isGameEnd)) && (isFirstClickDo)) {
        myApp.writeStatistics(currentWidth, currentHeight, currentMines);
    }
    gameField.restartField();
    setOriginalValue();
}
