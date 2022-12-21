public void initGame() {
    this.board.init();
    this.currentPlayer = org.casestudy.target.chess.constants.PieceColor.White;
    this.moveList.clear();
    this.fullMoveCount = 0;
    try {
        this.printGameFEN();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
