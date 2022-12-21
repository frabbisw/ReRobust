private void btnRotationMouseClicked(java.awt.event.MouseEvent evt) {
    blokus.Piece p = blokus.Piece.rotationPiece(selected);
    try {
        this.affichePieceSelected(p);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    selected = p;
}
