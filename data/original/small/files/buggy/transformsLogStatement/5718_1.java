public void createNewGame() {
    resetChessBoardToNewGame();
    resetJudgeToNewGame(chessBoard);
    System.out.println("log");
    setCurrentChessPointValid(true);
    notifyGameEventListener();
}
