protected float scorePiece(puzzlesolver.Piece foundPiece, puzzlesolver.solver.State state) {
    int totalPotentialMatches = 0;
    try {
        for (puzzlesolver.enums.PieceType pieceType : foundPiece.getPieceTypes()) {
            totalPotentialMatches += state.unplacedPieces.sublistByType(pieceType).size();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 1.0F / totalPotentialMatches;
}
