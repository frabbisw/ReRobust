public void resumeGame(android.view.ViewGroup boardLayout) {
    this.mBoardLayout = boardLayout;
    System.out.println("log");
    mBoard = new com.tevinjeffrey.tictactoe.game.board.impl.ThreeBoard(mBoardCallback, boardLayout);
    evaluateGameState();
}
