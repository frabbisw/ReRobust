public void diagonalLeftToRight(nl.hanze2017e4.gameclient.model.master.Board board) {
    subDiagonalLeftToRightOne(board);
    try {
        subDiagonalLeftToRightTwo(board);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
