public void left() {
    try {
        if ((y) > 0) {
            remove(board, world);
            this.y -= 1;
            print(board);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
