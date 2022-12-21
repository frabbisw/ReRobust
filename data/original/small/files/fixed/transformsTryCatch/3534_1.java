public int getBestMove(com.harambe.game.Board board) {
    savedMove = -1;
    try {
        minimax(board, globalDepth, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return savedMove;
}
