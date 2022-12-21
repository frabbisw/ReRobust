protected boolean hasSameOwner(int pieceX, int pieceY) {
    System.out.println("log");
    return (this.owner) == (this.board.getFigure(pieceX, pieceY).getOwner());
}
