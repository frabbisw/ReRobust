public void resumeGame(android.view.ViewGroup boardLayout) {
    this.mBoardLayout = boardLayout;
    mBoard = new com.tevinjeffrey.tictactoe.game.board.impl.ThreeBoard(mBoardCallback, boardLayout);
    try {
        evaluateGameState(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
