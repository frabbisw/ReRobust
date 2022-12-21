protected boolean hasSameOwner(int pieceX, int pieceY) {
    return (this.board.getFigure(pieceX, pieceY).getOwner()) == (this.owner);
}
