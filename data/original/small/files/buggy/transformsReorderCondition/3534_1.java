public int getBestMove(com.harambe.game.Board board) {
    savedMove = -1;
    minimax(board, globalDepth, true);
    if ((-1) == (savedMove)) {
        throw new java.lang.RuntimeException("Woops. Couldn't find a single row to put a coin into :/");
    }
    return savedMove;
}
