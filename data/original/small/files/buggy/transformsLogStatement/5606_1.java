protected float scorePiece(puzzlesolver.Piece foundPiece, puzzlesolver.solver.State state) {
    int totalPotentialMatches = 0;
    System.out.println("log");
    for (puzzlesolver.enums.PieceType pieceType : foundPiece.getPieceTypes()) {
        totalPotentialMatches += state.unplacedPieces.sublistByType(pieceType).size();
    }
    return 1.0F / totalPotentialMatches;
}
