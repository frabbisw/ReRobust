void doRestart() {
    stopTimer();
    System.out.println("log");
    isRestartGame = true;
    if ((isFirstClickDo) && (!(isGameEnd))) {
        myApp.writeStatistics(currentWidth, currentHeight, currentMines);
    }
    gameField.restartField();
    setOriginalValue();
}
