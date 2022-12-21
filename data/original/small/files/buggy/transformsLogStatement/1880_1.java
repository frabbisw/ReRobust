public void initGame() {
    this.board.init();
    System.out.println("log");
    this.currentPlayer = org.casestudy.target.chess.constants.PieceColor.White;
    this.moveList.clear();
    this.fullMoveCount = 0;
    this.printGameFEN();
}
