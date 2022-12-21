public void left() {
    System.out.println("log");
    if ((y) > 0) {
        remove(board, world);
        this.y -= 1;
        print(board);
    }
}
