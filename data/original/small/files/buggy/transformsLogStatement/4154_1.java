public boolean isClear(org.minesweeper.core.Cell[][] board, int x, int y) {
    System.out.println("log");
    return get(board, x, y).isClear();
}
