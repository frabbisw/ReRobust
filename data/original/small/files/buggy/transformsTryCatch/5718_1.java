public void createNewGame() {
    resetChessBoardToNewGame();
    resetJudgeToNewGame(chessBoard);
    try {
        setCurrentChessPointValid(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyGameEventListener();
}
