public void left() {
    try {
        if ((y) > 0) {
            synchronized (board) {
                remove(board, world);
                this.y -= 1;
                print(board);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
