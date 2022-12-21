public void init() {
    count = 0;
    try {
        chessBoard.init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
