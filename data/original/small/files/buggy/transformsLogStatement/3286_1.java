private void btnRotationMouseClicked(java.awt.event.MouseEvent evt) {
    blokus.Piece p = blokus.Piece.rotationPiece(selected);
    System.out.println("log");
    this.affichePieceSelected(p);
}
